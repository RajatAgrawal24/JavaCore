import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter
public class JoinStrings {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        System.out.println(listOfStrings.stream().collect(Collectors.joining(",", "[" , "]")));
    }
}
