package teoria;
import java.util.LinkedList;
import java.util.Queue;

public class Queuefila {

	public static void main(String[] args) {
		//primeiro a entrar será o primeiro a sair
		
		
		Queue<String> carros = new LinkedList<>();
		
		carros.add("Fusca");
		carros.add("Camaro");
		carros.add("Gol");
		carros.add("Ferrari"); 
		carros.add("Uno");
		
		//System.out.println("Elemento da fila no topo: "+ carros.peek());
		System.out.println("Elemento do topo da fila: "+carros.poll());
		
		for(String n:carros) {
			System.out.printf("%s|", n);
		}
		System.out.println();
		carros.clear();
		System.out.println(carros.isEmpty()?"Fila vazia.":"Fila com elementos.");
		
		
	}

}
