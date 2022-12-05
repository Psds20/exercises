package exercicios;

public class parimpararray {

	public static void main(String[] args) {
	
	int [] numeros = {1,23,21,2,5,98,64,64,26,53,27};
	parimpar(numeros);
	
	}
	
	public static void parimpar(int[]num) {
		for(int n:num) 
		System.out.printf("%d é %s%n",n,(n % 2 == 0 ? "par": "impar"));
	}
	}
	

