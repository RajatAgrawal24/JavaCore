import java.util.stream.Collectors;
import java.util.stream.Stream;

// Find sum of all digits of a number
public class SumOfAllDigits {
    public static void main(String[] args) {
        int i = 15623;
        System.out.println((Integer) Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum());
    }
}
