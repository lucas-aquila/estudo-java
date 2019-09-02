package teste;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		//Ele é uma função termiadora diferente do filter, e map, não da para enviar para outro stream
		Integer total = nums.stream().reduce(soma).get();
		System.out.println(total);
		
		Integer total2 = nums.parallelStream().reduce(1, soma);
		System.out.println(total2);
		
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
		
	}
}
