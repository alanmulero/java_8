package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ClasseAnonima {

	public static void main(String[] args) {
		// Quando você precisa de uma implementação rápida e única de uma interface ou classe abstrata.
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
	// Dessa forma eu preciso criar uma classe	
//		Consumer<String> consumidor = new ConsumidorDeString();
//		palavras.forEach(consumidor);
		
		
		
		// De forma direta como classe anonima:
		Consumer<String> consumidor = new Consumer<String>() {
			// já tenho que fornecer os métodos de implementação
			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		};
		
		// Tudo isso como lambda
		palavras.forEach(s -> {
			System.out.println(s);
		});
		
		// Quando tenho um unico comando
		palavras.forEach(s -> System.out.println(s));

	}

}
