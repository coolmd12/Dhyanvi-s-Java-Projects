//hashmap practice basics

import java.util.LinkedHashMap;

public class hashmapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitals = new LinkedHashMap<>();

        capitals.put("America","Washington DC");
        capitals.put("India","New Dehli");
        capitals.put("Country","Capital");

        System.out.println(capitals);
    }
}
