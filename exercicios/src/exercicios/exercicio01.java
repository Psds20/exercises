package exercicios;

import java.util.Scanner;
import java.util.Calendar;

public class exercicio01 {

	public static void main(String[] args) {


		
		int n1, res, anofal;
		
		Calendar ano = Calendar.getInstance();
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite a sua idade: ");
		n1 = ler.nextInt();
		
		
		
		
		
		if(n1 < 100) {
		
			anofal = 100 - n1;
			
			res = ano.get(Calendar.YEAR) + anofal;
	    System.out.println("você irá completar 100 anos em "+res);
		}
		else {
			
			System.out.println("número invalido");
		}
		
		
		
	}

}
