package teoria;

public class Metodosstring {

	public static void main(String[] args) {
		
		
		
		String nome = "Pedro ";
		String nome1 = "Silveira de Sousa";
		
		
		//length
        System.out.println("Tamanho da String nome: "+nome.length());
        //indexOf
        System.out.println("qual a posição de d em nome: "+nome.indexOf("d"));
        //charAt
		System.out.println("Caracter no indice 2 em nome: "+nome.charAt(2));
		
		//comparteTo
	    System.out.println(nome1.compareTo(nome));
	
		
	    //region matches
	    if(nome.regionMatches(0, nome1, 0, 5)) {
			System.out.println("Strings iguais até determinado índice");
		}else {
			System.out.println("Strings diferentes");
		}
		//endswith/startswith
	    if(nome.startsWith("Ped")){
	    System.out.println("Verdadeiro");
	    }else {
	    	System.out.println("Falso");
	    }
		//concat
	    System.out.println(nome.concat(nome1));
	    //substring
	    System.out.println(nome.substring(2,4));
	    //split
	    String[] n = nome1.split(" ");
	    for(String c:n) {
	    	System.out.println(c);
	    }
	    //trim - remove espaços vazios
	    System.out.println(nome.trim());
	    String nome2 = nome.trim();
	   
        //tochararray
	    char [] nomearray = nome2.toCharArray();
	    for(char c:nomearray){
	    	System.out.print(c);
	    	System.out.print("-");
	    }
	    // toupercase / tolowercase
	    System.out.println();
	    System.out.println(nome.toUpperCase());
	    
	    
	    
	    
	    
	    
	
	}

}
