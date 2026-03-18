import java.util.stream.IntStream;

public class CalcFactorial {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(IntStream.rangeClosed(1,n).reduce((a,b) -> a*b).getAsInt());
    }
}
