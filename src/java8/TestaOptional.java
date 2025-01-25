package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 
 */
public class TestaOptional {

	public static void main(String[] args) {
		
		List<OptionalClasse>carros = new ArrayList<OptionalClasse>();
		carros.add(new OptionalClasse("Fusca", 76));
		carros.add(new OptionalClasse("Gol", 2003));
		carros.add(new OptionalClasse("Puma gts", 74));
		carros.add(new OptionalClasse("Clio prata 2 portas", 2005));
		
		
		// Filtrando
		Optional<OptionalClasse> any = carros.stream() // Optional ajuda a trabalhar com null.
			.filter(carro -> carro.getAno() > 76)
			.findAny();
			any.get();
			
			
			System.out.println(any);// se não tiver retorna uma Exception
			
			
		any.ifPresent(o -> System.out.println("Esta presente: "+ o.getMarca()));
			
		// Devolve ou não. se tiver null
			
		OptionalClasse seTiverUm = any.orElse(null);	
		System.out.println(seTiverUm.getMarca());
		
		
		
		
		
		
		
		
		
		
		

	}

}
