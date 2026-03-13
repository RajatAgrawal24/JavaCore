import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupStringsByLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C#", "Jake", "Kotlin", "Snakes");
        list.stream().collect(Collectors.groupingBy(String::length)).forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
