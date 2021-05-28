package com.ironhack.leancrm.common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Utils {
    public static Integer getNextId(HashMap<Integer, ?> map) {
        return map.keySet().isEmpty() ? 1 : Collections.max(map.keySet()) + 1;
    }

    public static String removeNumeric(String str)
    {
        return str.chars().filter(ch -> !Character.isDigit(ch))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString().trim();
    }

    public static Integer removeAlphabetic(String str)
    {
        String retVal = str.chars().filter(ch -> Character.isDigit(ch))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        return retVal.isEmpty() ? null : Integer.parseInt(retVal);
    }
}
