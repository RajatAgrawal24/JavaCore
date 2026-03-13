import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.naturalOrder;

// Find the Second largest number in an Integer array
public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//        System.out.println(listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).toList());
        System.out.println(listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
        System.out.println(listOfIntegers.stream().sorted().skip(1).findFirst().get());
    }
}
