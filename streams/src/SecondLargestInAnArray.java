import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SecondLargestInAnArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 9, 5, 1, 0};
        System.out.println(Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1));;
    }
}
