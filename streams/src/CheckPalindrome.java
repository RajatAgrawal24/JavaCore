import java.util.Arrays;
import java.util.stream.IntStream;

// Check if a String is Palindrome or not
public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "ROTATOR";
        System.out.println(IntStream.range(1, s.length()/2).noneMatch(i -> s.charAt(s.length()-i) != (s.charAt(i-1))));
    }
}
