import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Get three maximum numbers and three minimum numbers from the given list of integers
public class GetThreeMinAndMaxNo {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println(listOfIntegers.stream().sorted().limit(3).toList());
        System.out.println(listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).toList());
    }
}
