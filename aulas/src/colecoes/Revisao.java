package colecoes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Revisao {

	public static void main(String[] args) {
		/*
		 * HashSet conjunto = new HashSet<>(); conjunto.add(1); conjunto.add(2);
		 * conjunto.add(3); conjunto.add(4); System.out.println(conjunto.toString());
		 * 
		 * conjunto.remove(1); System.out.println(conjunto.toString());
		 * System.out.println("Tamanho "+ conjunto.size());
		 * System.out.println("comtem 6? "+ conjunto.contains(6));
		 * System.out.println("Está vazio ? "+ conjunto.isEmpty());
		 * 
		 * 
		 * HashSet<String> nomes = new HashSet<>(2);
		 * System.out.println(nomes.add("Guilherme"));
		 * System.out.println(nomes.add("Maria"));
		 * System.out.println(nomes.add("João"));
		 */

		
		/*
		 * ArrayList<String> lista = new ArrayList<>(); lista.add("Guilherme");
		 * lista.add("Arroz"); lista.add("Arroz"); lista.add("Arroz");
		 * lista.add("Arroz"); System.out.println(lista.get(3).toString());
		 * System.out.println(lista.toString());
		 */
		
		/*
		 * Queue<String> fila = new LinkedList<>(); fila.offer("Arroz");
		 * fila.offer("Feijão"); fila.offer("Batata"); fila.offer("Alegrin");
		 * fila.offer("Carne"); System.out.println(fila); fila.poll(); fila.poll();
		 * fila.poll(); System.out.println(fila); System.out.println(fila.peek());
		 * fila.poll(); fila.poll(); System.out.println(fila.peek());
		 * System.out.println(fila.poll());
		 */
		
		
		Deque<String> livros = new ArrayDeque<>();
		livros.push("100 dias sem você");
		livros.push("Odineia");
		livros.push("A culpa é dos astros");
		livros.push("A garota no vagão");
		
		System.out.println(livros);
		livros.pop();
		livros.pop();
		System.out.println(livros);
		
	}

}
