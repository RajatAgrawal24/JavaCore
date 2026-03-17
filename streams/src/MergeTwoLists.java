import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 8, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 9, 11);

//        IntStream.concat(list1.stream().mapToInt(Integer::valueOf), list2.stream().mapToInt(Integer::valueOf)).forEach(System.out::println);

        System.out.println(Stream.concat(list1.stream(), list2.stream()).toList());
    }
}
