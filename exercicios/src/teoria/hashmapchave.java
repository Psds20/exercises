package teoria;

import java.util.HashMap;
public class hashmapchave {

	public static void main(String[] args) {
		
		HashMap<Integer, String> carros = new HashMap<>();
		
      int c = 6;
		carros.put(1, "Fusca");
		carros.put(2, "Gol");
		carros.put(3, "Camaro");
		carros.put(4, "Ferrari");
		carros.put(5, "Audi");
		carros.put(6, "Panamera");
		
		
		
	
				for(String n:carros.values()) {
					
					System.out.printf("%s|", n);
				}
		System.out.println();
		
		System.out.println(carros.isEmpty()?"Hashmap vazio.":"Hashmap com items.");
		System.out.println(carros.containsKey(c)?"Carros contém à chave "+c :"Carro não contem à chave "+c);
		
		System.out.println(carros.get(c));
		

	}

}
