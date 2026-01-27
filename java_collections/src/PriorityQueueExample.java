import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);

        // Peek at highest priority (smallest number)
        System.out.println("Peek: " + pq.peek()); // 10

        // Removing elements (in priority order)
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // 10, 20, 30, 50
        }
    }
}