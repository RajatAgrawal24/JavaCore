import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements
        deque.addFirst("A");  // Add at front
        deque.addLast("B");   // Add at back
        deque.addFirst("Z");
        deque.addLast("C");

        System.out.println(deque); // [Z, A, B, C]

        // Removing elements
        System.out.println("Remove first: " + deque.removeFirst()); // Z
        System.out.println("Remove last: " + deque.removeLast());   // C

        System.out.println(deque); // [A, B]

        // Using as Stack (LIFO)
        deque.push("X");
        deque.push("Y");
        System.out.println("Pop: " + deque.pop()); // Y
    }
}