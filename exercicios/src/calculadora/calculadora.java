package calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		boolean calc = true;
		String S;
		
		
		float num = 0;
       float num_multi = 0;
		
       while(calc) {
			S = apresentar(ler);
			System.out.println(S);
			
			switch(S) {
		
			case "1":
				
				System.out.println(num);
				System.out.println("Numéro à somar: ");
				num_multi = ler.nextFloat();
				num =  num + num_multi;
			    break;
			case "2":
				System.out.println(num);
				System.out.println("Numéro à subtrair: ");
				num_multi = ler.nextFloat();
				num =  num - num_multi;
			    break;
			case "3":
				System.out.println(num);
				if(num == 0) {
				System.out.println("Número à multiplicar: ");
				num = ler.nextFloat();
				System.out.println("Segundo Número à multiplicar ");
				num_multi = ler.nextFloat();
				
				num = num * num_multi;
			}
			else {
				   
					System.out.println("Número à multiplicar: ");
					num_multi = ler.nextFloat();
					num =  num_multi * num;
			}
				
				 break;
			case "4":
				num = 0;
				System.out.println("Zerando");
			    break;    
				
				
				
			
				default:
					calc = false;
				System.out.println("Encerrando programa");
			}
			
			
			
		}
		
		
		
		
	}
	public static String apresentar(Scanner ler) {
		
		String res;
		System.out.println("1)Somar");
		System.out.println("2)Subtrair");
		System.out.println("3)Multiplicar");
		System.out.println("4)Zerar");
		res = ler.next();
		return res;
		
	}
	
	

}
