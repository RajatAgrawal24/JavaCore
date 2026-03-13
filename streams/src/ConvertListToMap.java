import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class ConvertListToMap {
	public static void main(String[] args){
		List<String> list = Arrays.asList("Lucky", "Mitra", "Mighty", "Raju");
		
		Map<String,Integer> map =list.stream().collect(Collectors.toMap(Function.identity(), String::length));

		map.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
		
	}
}