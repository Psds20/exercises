package teoria;

import java.util.Arrays;
import java.util.Scanner;

public class arrrayjava {

	public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
		final int espacos = 6;
		
		
		
		int [] numeros = {2, 4,3,0, 5,1};
		
		
		Arrays.sort(numeros);
		
		int [] num = new int[espacos];
	
		
		for(int c = 0; c < numeros.length; c++) {
			
			System.out.println(numeros[c]);
			
		}
		
	
		
	}

}
