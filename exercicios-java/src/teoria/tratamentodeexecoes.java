package teoria;

import java.util.ArrayList;

public class tratamentodeexecoes {

	public static void main(String[]args) {

	ArrayList<String> carros = new ArrayList<>();
	
	
	carros.add("Fusion");
	carros.add("Corola");
	carros.add("Fusca");
	carros.add("Gol");
	carros.add("Camaro");
	
	int nota1, nota2 , res;
	
	nota1 = 50;
    nota2 = 40; 
	
	
	if(nota1 > 50) {
		throw new IllegalArgumentException("Valor da nota 1 invalido");
	}
	if(nota2 > 50) {
		throw new IllegalArgumentException("Valor da nota 2 invalido");
	}
	res = nota1 + nota2;

	System.out.println(res);
	
	
	
	
	
	
	
	/*
	tratamento de erros/exceções
	
	try {
	
	System.out.println(carros.get(8));
	}
	
	catch(IndexOutOfBoundsException e) {
		System.out.println("Erro: "+ e.getMessage());
	}
	catch(ClassCastException e) {
		System.out.println("Erro: "+ e.getMessage());
	}
	finally {
		
		System.out.println("final do programa");
	}
	
	*/
	
	}
}
