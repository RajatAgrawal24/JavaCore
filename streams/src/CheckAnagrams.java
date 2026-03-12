import java.util.stream.Collectors;
import java.util.stream.Stream;

// check if two strings are anagrams or not
public class CheckAnagrams {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        System.out.println(s1.chars().sorted()
                .mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.joining())
                .equals(
                        s2.chars().sorted()
                                .mapToObj(c -> String.valueOf((char)c))
                                .collect(Collectors.joining())));

        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        System.out.println(s1.equals(s2));
    }
}
