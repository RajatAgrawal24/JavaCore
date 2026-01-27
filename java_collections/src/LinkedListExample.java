import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Adding at specific positions
        numbers.addFirst(5);  // Add at beginning
        numbers.addLast(40);  // Add at end
        numbers.add(2, 15);   // Add at index 2

        // Accessing elements
        System.out.println("First: " + numbers.getFirst()); // 5
        System.out.println("Last: " + numbers.getLast());   // 40

        // Removing elements
        numbers.removeFirst();
        numbers.removeLast();

        System.out.println(numbers); // [10, 15, 20, 30]
    }
}