import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Given a list of integers, separate odd and even numbers
public class SeparateOddEven {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> map = numList.stream().collect(Collectors.partitioningBy((i) -> i%2==0));
        for(Boolean b : map.keySet()){
            System.out.println(map.get(b));
            System.out.println();
        }
    }
}
