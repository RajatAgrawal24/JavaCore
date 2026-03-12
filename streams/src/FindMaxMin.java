import java.util.Arrays;
import java.util.List;

// Given a list of integers, find maximum and minimum of those numbers
public class FindMaxMin {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        // Find MAX
//        System.out.println(listOfIntegers.stream().mapToInt(Integer::intValue).max().getAsInt());
//        int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println(listOfIntegers.stream().max(Integer::compareTo).get());
        System.out.println(listOfIntegers.stream().min(Integer::compareTo).get());
    }
}
