package HashMap;

import java.util.HashMap;
import java.util.Map;

public class STL {
    public static void main(String[] args) {
        // Create a new HashMap to store names and ages
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("Suraj", 21);
        map.put("Ruchima", 20);
        map.put("Priyanka", 19);
        map.put("priya", 18);
        map.put("raftaar", 20);

        // Print the entire map
        System.out.println(map);

        // Get and print the value associated with the key "Ruchima"
        System.out.println(map.get("Ruchima"));

        // Remove the key "Ruchima" from the map
        map.remove("Ruchima");

        // Print the map after removing "Ruchima"
        System.out.println(map);

        // Try to get the value associated with the key "Ruchima" after it has been removed
        System.out.println(map.get("Ruchima"));

        // Update the value associated with the key "Suraj"
        map.put("Suraj", 22);

        // Print the map after updating "Suraj"
        System.out.println(map);

        // Check if the map contains the key "Suraj"
        System.out.println(map.containsKey("Suraj"));

        // Check if the map contains a value of 20
        System.out.println(map.containsValue(20));

        // Print the size of the map
        System.out.println(map.size());

        // Iterate over the keys in the map and print each key-value pair
        for (String k : map.keySet()) {
            System.out.println("The age of " + k + " is " + map.get(k));
        }
    }
}
