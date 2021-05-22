package com.ironhack.leancrm.common;

import java.util.Collections;
import java.util.Map;

public class Utils {
    public static Integer getNextId(Map<Integer,Object> map) {
        return Collections.max(map.keySet()) + 1;
    }
}
