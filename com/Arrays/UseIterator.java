package com.Arrays;


import java.util.*;

public class UseIterator {
    public static void main(String[] args) {
        // Set collection
//        Set<String> set = new HashSet<>();
//        set.add("Stop");
//        set.add("Look");
//        set.add("Listen");
//
//        Iterator<String> iterator = set.iterator();
//
//        while(iterator.hasNext())
//        {
//           String text = iterator.next();
//            System.out.println(text);
//        }

            // List collection
//        List<String> list = new ArrayList<>();
//        list.add("Mama");
//        list.add("Mila");
//        list.add("Ramu");
//
//        Iterator<String> iterator = list.iterator();
//
//        while (iterator.hasNext()){
//            String text = iterator.next();
//            System.out.println(text);
//        }

        // Map collection

        Map <String, String> map = new HashMap<>();

        map.put("first", "Stop");
        map.put("second", "Look");
        map.put("third", "Listen");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String key  = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
