package com.hypertek.ClassesAndPointers;

import java.util.HashMap;

public class Pointers {
    public static void main(String[] args) {
        var Map1 = new HashMap<String, Integer>();
        var Map2 = new HashMap<String, Integer>();
        Map1.put("One", 12);
        Map2 = Map1;
        System.out.println(Map2);
        Map1.put("One", 22);
        System.out.println(Map2);
    }
}
