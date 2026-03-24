import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicatesInAList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 5, 4, 6, 5, 1, 8);
        System.out.println(list.stream().collect(Collectors.groupingBy(x->x, Collectors.counting())).entrySet().stream().filter(e -> e.getValue()>1).map(Map.Entry::getKey).toList());
    }
}
