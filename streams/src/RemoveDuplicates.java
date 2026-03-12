import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Remove Duplicate elements
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        System.out.println(listOfStrings.stream().distinct().collect(Collectors.toList()));
    }
}
