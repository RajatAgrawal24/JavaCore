import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitals = new LinkedHashMap<>();

        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington DC");
        capitals.put("Japan", "Tokyo");
        capitals.put("France", "Paris");

        // Order maintained
        for (String country : capitals.keySet()) {
            System.out.println(country + " -> " + capitals.get(country));
        }
    }
}