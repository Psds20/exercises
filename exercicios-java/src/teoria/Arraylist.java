package teoria;

import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
		// Array melhorado

		
		
		ArrayList<String> carros = new ArrayList<>();
		
		
		carros.add("Fusion");
		carros.add("Corola");
		carros.add("Fusca");
		carros.add("Gol");
		carros.add("Camaro");
		
		
	  //  encontra a posi��o de um elemento no array
		System.out.println(carros.indexOf("Fusion"));
		
		//.trimToSize() == remove todos elementos n�o utilizados no ArrayList
		
		//remove elementos no array
		carros.remove("Fusion");
		
		// .size() == .length() para arrays normais
		
		for(String n:carros){
			System.out.println(n);
		}
	
	}

}
