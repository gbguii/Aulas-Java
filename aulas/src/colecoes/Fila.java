package colecoes;
import java.util.Queue;
import java.util.LinkedList;
public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>(); 


        // diferenças entre add e offer. Ambos adicionam
        // quando a lista passar do que o limite permitido
        fila.add("Ana");  // lanca exceção
        fila.offer("Bia");  // retorna falso
        fila.offer("Gui");
        fila.offer("Gabi");
        fila.offer("Jão");
        fila.offer("Pedro");

        // diferenças entre peek e element. Ambos retornam o 
        // proximo valor  da fila sem remover

        // quando a lista estiver vazia
        System.out.println(fila.peek()); // retorna nulll
        System.out.println(fila.element()); // laça exceção

        // fila.size();  tamanho
        // fila.clear();  limpar
        // fila.isEmpty();  verificar se esta vazio


        System.out.println(fila.poll()); // pega o proximo da fila e remove; se não tiver? NULL
        System.out.println(fila.poll()); // pega o proximo da fila e remove; se não tiver? NULL
        System.out.println(fila.remove()); // quando nao tiver proximo na fila? lança exceção
    }
}
