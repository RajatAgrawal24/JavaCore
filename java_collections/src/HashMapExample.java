import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();

        // Adding key-value pairs
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 28);
        ages.put("Alice", 26); // Updates existing value

        // Getting value by key
        System.out.println("Alice's age: " + ages.get("Alice")); // 26

        // Checking if key exists
        System.out.println("Has Bob? " + ages.containsKey("Bob")); // true

        // Checking if value exists
        System.out.println("Has age 30? " + ages.containsValue(30)); // true

        // Removing entry
        ages.remove("Bob");

        // Iterating through Map
        for (String name : ages.keySet()) {
            System.out.println(name + " is " + ages.get(name) + " years old");
        }

        // Alternative iteration
        for (HashMap.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}