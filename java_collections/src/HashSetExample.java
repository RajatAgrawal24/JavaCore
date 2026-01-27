import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        // Adding elements
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Mumbai"); // Duplicate - won't be added

        System.out.println(cities); // Order not guaranteed
        System.out.println("Size: " + cities.size()); // 3

        // Checking membership
        System.out.println("Has Delhi? " + cities.contains("Delhi")); // true

        // Removing element
        cities.remove("Delhi");

        // Iterating
        for (String city : cities) {
            System.out.println(city);
        }
    }
}