import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//From the given list of integers, print the numbers which are multiples of 5
public class FilterMultiplesOfFive {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println(listOfIntegers.stream().filter(num -> num%5==0).toList());
    }
}
