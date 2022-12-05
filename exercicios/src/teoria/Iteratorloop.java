package teoria;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorloop {

	public static void main(String[] args) {
		// Facilitador de loops em coleções
		
		
		ArrayList<String> carros = new ArrayList<>();
		
		carros.add("Fusca");
		carros.add("Camaro");
		carros.add("Ferrari");
		carros.add("Uno");
		carros.add("Gol");
		carros.add("Porshe");
		carros.add("Celta");

		Iterator<String> it = carros.iterator();
		
		
		while(it.hasNext()) {
			if(it.next().equals("Fusca")) {
				it.remove();
			}
		
		}
System.out.println(carros);
		
	}

}
