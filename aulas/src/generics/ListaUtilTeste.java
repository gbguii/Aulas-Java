package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	public static void main(String[] args) {
		List<Double> nums = Arrays.asList(1.2, 3.2, 5.4, 3.4);
		double valorNum = ListaUtil.ultimoElemento(nums);
		System.out.println(valorNum);
		
		List<String> ling = Arrays.asList("Java", "JavaScript", "PHP", "Go");
		String valorString = ListaUtil.ultimoElemento(ling);
		System.out.println(valorString);
	}
}
