import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Double> prices = new TreeMap<>();

        prices.put("Banana", 40.0);
        prices.put("Apple", 120.0);
        prices.put("Orange", 80.0);
        prices.put("Mango", 150.0);

        System.out.println(prices.hashCode());

        // Keys automatically sorted
        System.out.println(prices); // {Apple=120.0, Banana=40.0, Mango=150.0, Orange=80.0}

        // TreeMap specific methods
        System.out.println("First key: " + prices.firstKey());   // Apple
        System.out.println("Last key: " + prices.lastKey());     // Orange
        System.out.println("Higher than Banana: " + prices.higherKey("Banana")); // Mango
    }
}