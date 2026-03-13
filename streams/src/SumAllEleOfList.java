import java.util.*;

public class SumAllEleOfList {
	public static void main(String[] args){
		List<Integer> list = Arrays.asList(10, 30, 20, 50 , 40);
		System.out.println(list.stream().mapToInt(Integer::valueOf).sum());
	}
}