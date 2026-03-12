import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

// Merge two unsorted arrays into single sorted array without Duplicates
public class MergeTwoUnsortedArrays {
    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        System.out.println(Arrays.toString(IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray()));
    }
}
