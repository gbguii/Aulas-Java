package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Gabi", 6.1);
		Aluno a3 = new Aluno("Gui", 7.4);
		Aluno a4 = new Aluno("Jo�o", 8.6);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota > 7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		
		BiFunction<Media, Double, Media> calculaMedia = 
				(media, nota) -> media.adicionar(nota);
		BinaryOperator<Media> combinarMedia = 
				(m1, m2) -> Media.combinar(m1, m2);
		
		Media aprovados = alunos.stream()
			  .filter(aprovado)
			  .map(apenasNota)
			  .reduce(new Media(), calculaMedia, combinarMedia);
		System.out.println("A media dos aprovados � "+aprovados.getValue());
	}

}
