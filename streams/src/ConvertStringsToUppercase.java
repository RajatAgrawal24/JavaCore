import java.util.*;

public class ConvertStringsToUppercase {
	public static void main(String[] args){
		List<String> list = Arrays.asList("Lucky", " ", "sid", "miTra");
		list.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}
