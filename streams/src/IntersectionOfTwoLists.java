import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 8, 5);
        List<Integer> list2 = Arrays.asList(1, 4, 8, 11);

        Set<Integer> set = list1.stream().collect(Collectors.toSet());
        System.out.println(list2.stream().filter(set::contains).toList());

//        System.out.println(list1.stream().filter(list2::contains).toList());
    }
}
