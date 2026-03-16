import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumListOfList {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int n = 5;
        for(int i=0;i<5;i++){
            list.add(new ArrayList<>());
            list.get(i).add(1);
            list.get(i).add(2);
            list.get(i).add(4);
            list.get(i).add(3);
        }

        System.out.println(list.stream().map(l -> l.stream().mapToInt(Integer::valueOf).sum()).reduce(Integer::sum).get());
    }
}
