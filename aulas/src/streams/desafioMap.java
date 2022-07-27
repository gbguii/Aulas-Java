package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class desafioMap {

	public static void main(String[] args) {
		Consumer<Integer> print = System.out::println;
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		/**
		 * 1. Número para string binária... 6 = "110"
		 * 2. Inverter a tring.... "110" = "011"
		 * 3. Converter de volta para inteiro = "011" = 3
		 */
		Function<Integer, String> toBinary = n -> Integer.toBinaryString(n);
		UnaryOperator<String> invertBinary = str -> {
			StringBuilder sb = new StringBuilder(str);
			return sb.reverse().toString();
		};
		Function<String, Integer> toInteger = str -> Integer.parseInt(str, 2);
		
		nums.stream()
			.map(toBinary)
			.map(invertBinary)
			.map(toInteger)
			.forEach(print);
	}

}
