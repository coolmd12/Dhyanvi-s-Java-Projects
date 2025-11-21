//

import java.util.Scanner;
import java.util.HashMap;

public class HashmapKeyRemoving {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("Capital of India", "New Delhi");
        map.put("Capital of USA", "Washington D.C.");
        map.put("Capital of Japan", "Tokyo");

        // Display the map before removal
        System.out.println("HashMap before removal: " + map);

        // Take input for key to remove
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key to remove: ");
        String key = sc.nextLine(); // key is a String

        // Check and remove the key
        if (map.containsKey(key)) {
            map.remove(key);
            System.out.println("Key \"" + key + "\" removed successfully.");
        } else {
            System.out.println("Key \"" + key + "\" not found in the map.");
        }

        // Display the map after removal
        System.out.println("HashMap after removal: " + map);

        sc.close(); // close scanner
    }
}