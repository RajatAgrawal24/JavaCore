import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10);

        System.out.println("Original List: " + numbers);

        Collections.sort(numbers);
        System.out.println("After Sorting: " + numbers);

        int index = Collections.binarySearch(numbers, 30);
        System.out.println("Index of 30: " + index);

        Collections.reverse(numbers);
        System.out.println("After Reverse: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("After Shuffle: " + numbers);

        System.out.println("Minimum Value: " + Collections.min(numbers));
        System.out.println("Maximum Value: " + Collections.max(numbers));

        int freq = Collections.frequency(numbers, 10);
        System.out.println("Frequency of 10: " + freq);

        Collections.replaceAll(numbers, 10, 99);
        System.out.println("After ReplaceAll (10 -> 99): " + numbers);

        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>(numbers));
        System.out.println("Synchronized List: " + syncList);

        List<Integer> unmodifiableList = Collections.unmodifiableList(numbers);
        System.out.println("Unmodifiable List: " + unmodifiableList);

        List<String> single = Collections.singletonList("Lucky");
        System.out.println("Singleton List: " + single);

        List<String> empty = Collections.emptyList();
        System.out.println("Empty List size: " + empty.size());
    }
}
