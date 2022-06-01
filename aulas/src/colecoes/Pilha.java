package colecoes;
import java.util.Deque;
import java.util.ArrayDeque;
public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("A Garota no Trem");
        livros.push("Thanos: o Titã consumido"); // adiciona / retorna false
        livros.push("13 whys");  // adiciona / retorna false

        System.out.println(livros.peek());
        System.out.println(livros.peek());

        System.out.println(livros.poll());
        System.out.println(livros.element());
        System.out.println(livros.pop()); // remove / lança exceção
        System.out.println(livros.peek());
    }
}
