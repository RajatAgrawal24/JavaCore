import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        // Pushing elements
        books.push("Book 1");
        books.push("Book 2");
        books.push("Book 3");

        // Viewing top element
        System.out.println("Top book: " + books.peek()); // Book 3

        // Popping elements
        System.out.println("Removed: " + books.pop()); // Book 3
        System.out.println("Removed: " + books.pop()); // Book 2

        // Check if empty
        System.out.println("Is empty? " + books.empty()); // false

        System.out.println("Remaining: " + books); // [Book 1]
    }
}