package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestaCurso {

	private static int sum;

	public static void main(String[] args) {
		// Métodos do Java 8

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		// Comparando
		cursos.sort(Comparator.comparing(Curso::getAlunos).reversed());
		// Imprimindo:
		cursos.forEach(System.out::println); // colocando toString

		// ou

		cursos.forEach(c -> System.out.println(c.getNome()));

		// Imprimir cursos com mais de 100 alunos:
		cursos.stream().filter(curso -> curso.getAlunos() >= 50).map(s -> s.getAlunos()).forEach(System.out::println);

		// Mas é possível trabalhar só com ints, invocando o método mapToInt:
		// possui novos métodos específicos para trabalhar com inteiros. Um exemplo? A
		// soma:
		// IntStream stream = cursos.stream()

		sum = cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.mapToInt(Curso::getAlunos)
				.sum();
		System.out.println(sum);
		
		// Incluindo em uma List ou Set ou Map
		List<Curso> resultado = cursos.stream()
				// ou:  curso  = cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toList());
		
		// com map
		cursos.stream()
		.filter(c -> c.getAlunos() == 150)
		.collect(Collectors.toMap(c -> c.getNome(),
				c -> c.getAlunos()));
		System.out.println(cursos);
	}

}
