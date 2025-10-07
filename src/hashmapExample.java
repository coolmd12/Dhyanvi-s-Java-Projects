//hashmap practice basics

import java.util.LinkedHashMap;

public class hashmapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitals = new LinkedHashMap<>();

        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington D.C.");
        capitals.put("France", "Paris");

        System.out.println(capitals);
    }
}