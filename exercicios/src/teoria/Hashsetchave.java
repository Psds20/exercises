package teoria;

import java.util.HashSet;

public class Hashsetchave {

	public static void main(String[] args) {
		// Elementos unicos na cole��o
		
		HashSet<String> carros = new HashSet<>();
		
		
		
		carros.add("Camaro");
		carros.add("Fusca");
		carros.add("ferrari");
		carros.add("Gol");
		carros.add("Uno");
		
		System.out.println(carros.add("Polo")?"Sim":"N�o");
		System.out.println(carros.add("Polo")?"Sim":"N�o");
       // carros.remove("Fusca");
        //carros.clear();
        
        carros.forEach(linhas -> System.out.printf("%s|", linhas));
		
		
		
		
	}

}
