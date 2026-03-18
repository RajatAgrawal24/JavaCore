import java.util.stream.Stream;

public class CalcSumOfDigits {
    public static void main(String[] args) {
        int num = 43527;
        System.out.println(String.valueOf(num).chars().map(ch -> ch-'0').sum());
    }
}
