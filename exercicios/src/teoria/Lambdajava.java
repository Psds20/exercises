package teoria;

import java.util.ArrayList;

public class Lambdajava {

	public static void main(String[] args) {
		//encurtar codigos e diminuir codificação
		
		ArrayList<Integer> valores = new ArrayList<>();
		ArrayList<Integer> dobro = new ArrayList<>();
		ArrayList<Integer> par = new ArrayList<>();
		ArrayList<Integer> impar = new ArrayList<>();
		
		valores.add(1);
		valores.add(2);
		valores.add(3);
		valores.add(4);
		valores.add(5);
		valores.add(6);
		
		valores.forEach(c ->{ dobro.add(c*2);
		if(c % 2 == 0) 
		{
			par.add(c);
			}
		else {
			impar.add(c);
			}
		});
		System.out.println(valores);
		System.out.println(dobro);
		System.out.println(par);
		System.out.println(impar);
		
		
	}
	
	
	
}
