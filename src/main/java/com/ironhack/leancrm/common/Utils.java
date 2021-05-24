package com.ironhack.leancrm.common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Utils {
    public static Integer getNextId(HashMap<Integer, ?> map) {
        return map.keySet().isEmpty() ? 1 : Collections.max(map.keySet()) + 1;
    }
}
