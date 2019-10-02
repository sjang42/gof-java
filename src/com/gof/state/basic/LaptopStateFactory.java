package com.gof.state.basic;

import java.util.HashMap;
import java.util.Map;

public class LaptopStateFactory {
    private static Map<String, LaptopState> map = new HashMap<>();

    static {
        map.put("on", new LaptopOn());
        map.put("off", new LaptopOff());
        map.put("listen", new LaptopListen());
    }

    public static LaptopState getInstance(String state) {
        return map.get(state);
    }
}
