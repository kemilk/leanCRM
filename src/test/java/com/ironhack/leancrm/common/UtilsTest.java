package com.ironhack.leancrm.common;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void getNextIdTest() {
        HashMap<Integer,Object> testMap=new HashMap<>();
        testMap.put(1, 50);
        testMap.put(32, 60);
        testMap.put(3, 30);
        testMap.put(4, 60);
        testMap.put(5, 60);

        //highest key is 32 => next free ID is 33
        assertEquals(33, Utils.getNextId(testMap));

        //set next HashMap entry with next (free) id 33
        testMap.put(Utils.getNextId(testMap), 400);

        //expect 33+1 as next free id
        assertEquals(34, Utils.getNextId(testMap));

        //add new HashMap entry with manually chosen key
        testMap.put(678, 1);
        assertEquals(679, Utils.getNextId(testMap));
    }
}