import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingLetter {
    public static void main(String[] args) {
        String s = "lluuuckyyyy";
        Map<Character, Long> map = s.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(x->x, Collectors.counting()));
        OptionalInt ans = s.chars().filter(ch -> map.get((char)ch)==1).skip(1).findFirst();
        System.out.println((char)ans.getAsInt());
    }
}
