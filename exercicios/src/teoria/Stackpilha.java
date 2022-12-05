package teoria;

import java.util.Stack;

public class Stackpilha {

	public static void main(String[] args) {
		
		//primeiro a entrar será o ultimo a sair
		
		
		Stack<String> carros = new Stack();
		
		carros.push("Fusca");
		carros.push("Camaro");
		carros.push("Ferrari");
		carros.push("Uno");
		carros.push("Gol");
		
		//System.out.println("Elemento do topo da pilha: " + carros.peek());
		System.out.println("Elemento do topo da pilha: "+ carros.pop());
		
		for(String n:carros) {
			System.out.printf("%s|", n);
		}
		System.out.println();
		carros.clear();
		System.out.println(carros.empty()?"Pilha vazia.":"Pilha com elementos.");
		
		
		
	}

}
