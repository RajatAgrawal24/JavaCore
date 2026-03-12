import java.util.function.Supplier;
import java.util.stream.IntStream;

public class PrintTenEvenNumbers {
    public static void main(String[] args) {
//        IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);
        IntStream.iterate(2,i -> i+2).limit(10).forEach(System.out::println);
    }
}
