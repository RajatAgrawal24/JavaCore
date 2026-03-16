import java.util.Arrays;
import java.util.List;

public class CovertIntegerToStrings {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 4, 3, 1, 2, 4, 3);
        List<String> res = list.stream().map(String::valueOf).toList();
        System.out.println(res);
    }
}
