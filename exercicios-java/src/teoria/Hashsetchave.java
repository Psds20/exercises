package teoria;

import java.util.HashSet;

public class Hashsetchave {

	public static void main(String[] args) {
		// Elementos unicos na coleção
		
		HashSet<String> carros = new HashSet<>();
		
		
		
		carros.add("Camaro");
		carros.add("Fusca");
		carros.add("ferrari");
		carros.add("Gol");
		carros.add("Uno");
		
		System.out.println(carros.add("Polo")?"Sim":"Não");
		System.out.println(carros.add("Polo")?"Sim":"Não");
       // carros.remove("Fusca");
        //carros.clear();
        
        carros.forEach(linhas -> System.out.printf("%s|", linhas));
		
		
		
		
	}

}
