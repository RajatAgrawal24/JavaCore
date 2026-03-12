import java.util.Arrays;
import java.util.stream.IntStream;

// Reverse an integer array
public class ReverseAnIntegerArray {
    public static void main(String[] args) {
        int[] nums = new int[] {5, 1, 7, 3, 9, 6};
        System.out.println(Arrays.toString(IntStream.rangeClosed(1, nums.length).map(i -> nums[nums.length - i]).toArray()));
    }
}
