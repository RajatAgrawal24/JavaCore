import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FlattenListOfLists {
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

        List<Integer> res = list.stream().flatMap(Collection::stream).toList();
        System.out.println(res);
    }
}
