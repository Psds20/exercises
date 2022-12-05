package exercicios;

import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner ler =  new Scanner(System.in);
		
		
   int nota = 0;
	
	           
   
   String [] perguntas = {"Qual é o astro mais distante?","Quanto é 20 * 2?","Qual a primeira letra do nosso alfabeto?","Qual jogo é FPS?","Qual jogo é moba?"};
   String [] alternativas = {"a) Terra | b) Sol | c) lua ","a) 30 | b) 35 | c) 40","a) a | b) v | c)s","a) Cs | b) Dota | c) Lol","a) Cs | b) Dota | c) Valorant"};
   String [] rescorretas = {"b", "c", "a", "a", "b"};
   String [] res = new String[5]; 	
	
	for(int c = 0; c < 5; c++) {
		
		System.out.printf("%s%n%s%n",perguntas[c],alternativas[c]);
		res[c] = ler.next();
	}
	 for(int c = 0; c < 5; c++) {
		 if(rescorretas[c].equalsIgnoreCase(res[c])) {
			 nota += 2;
		 }
	 }
	 System.out.printf("Sua nota é %d",nota);
	 
	 
	 
	 
	}

}
