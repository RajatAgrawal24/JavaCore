import java.util.function.Function;
import java.util.stream.Collectors;

// Count Frequency of each Character
public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        System.out.println(inputString.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }
}
