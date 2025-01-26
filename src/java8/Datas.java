package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		// Datas e time no Java 8
		// Muitos métodos estaticos.
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		// Calculando tempo 
		LocalDate etVarginha = LocalDate.of(1996,Month.JANUARY, 20);
		int tempoPercorrido = agora.getYear() - etVarginha.getYear();
		System.out.println(tempoPercorrido);
		
		// Analizando periodo
		Period periodo = Period.between(agora, etVarginha);
		System.out.println(periodo);
		
		// Formatadores:
		//DataTimeFormatter formatador = DataTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String datadoET = etVarginha.format(formatador);
		System.out.println(datadoET);
		
		// Para usar horas, minutos e segundos
		
		LocalDateTime horas = LocalDateTime.now();
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

		System.out.println(horas.format(formatadorComHoras));
		
		
	}

}
