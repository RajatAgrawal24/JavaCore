import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

// Count Frequency Of each Element
public class FreqOfEachElement {
    public static void main(String[] args) {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        System.out.print(stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }
}
