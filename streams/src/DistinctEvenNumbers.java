import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class DistinctEvenNumbers {
	public static void main(String[] args){
		List<Integer> list = Arrays.asList(10, 20 , 30, 20, 10, 50);
		// list.stream().filter(n -> n%2==0).distinct().forEach(System.out::println);
		list.stream().filter(n -> n%2==0).collect(Collectors.groupingBy(a->a, Collectors.counting())).entrySet().stream().filter(e -> e.getValue()<2).forEach(e -> System.out.println(e.getKey()));
	}
}