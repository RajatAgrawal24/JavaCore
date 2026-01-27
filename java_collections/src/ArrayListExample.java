import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add(null);
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicates allowed

        System.out.println(fruits.get(0)); // Apple

        System.out.println("Size: " + fruits.size()); // 4

        System.out.println(fruits.contains("Banana")); // true

        fruits.remove("Apple");
        fruits.remove(0); // Remove by index

        // Iterating
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}