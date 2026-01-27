import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(95);
        scores.add(85); // Duplicate - ignored

        System.out.println(scores); // [78, 85, 92, 95] - sorted order

        // TreeSet specific methods
        System.out.println("Lowest: " + scores.first());  // 78
        System.out.println("Highest: " + scores.last());  // 95
        System.out.println("Higher than 85: " + scores.higher(85)); // 92
        System.out.println("Lower than 90: " + scores.lower(90));   // 85
    }
}