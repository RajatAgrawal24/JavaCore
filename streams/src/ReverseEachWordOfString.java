import java.util.stream.Collectors;
import java.util.stream.Stream;

// Reverse each word of a string using Java 8 streams
public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        System.out.println(Stream.of(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" ")));;
    }
}
