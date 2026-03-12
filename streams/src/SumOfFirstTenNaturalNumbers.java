import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfFirstTenNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 11).sum());
    }
}
