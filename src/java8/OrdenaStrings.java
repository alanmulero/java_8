package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
	
	public static void main(String[] args) {
		
		
		// Metodo velho, anterior ao java 8
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		// criando um comparador com o Comparator
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		// Para usar basta passar como segundo argumento
		
		Collections.sort(palavras, comparador);
		System.out.println(palavras);
		
		Collections.sort(palavras);
		System.out.println(palavras);
		
		// Depois do java 8, a propria List tem o metodo sort()
		palavras.sort(comparador); // Passando o comparador que criamos. Implementando um metodo default em uma Interface
		System.out.println("Java 8 =>"+palavras);
		
		// outro exemplo de metodo defoult na Interface
		// antigo:
		for(String p : palavras) {
			System.out.println(p);
		}
		
		// forma nova no Java 8
		palavras.forEach(p -> System.out.println("No forEach =>" + p));
		
		
	}
}
 
class ComparadorPorTamanho implements Comparator<String>{
	
	// usando outro metodo para comparar

	@Override
	public int compare(String o1, String o2) {
		if(o1.length() < o2.length()) {
			return -1;
		}if(o1.length() > o2.length()) {
			return 1;
		}
		return 0;
	}
	
}