import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortStringsInReverseOrder {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        listOfStrings.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
