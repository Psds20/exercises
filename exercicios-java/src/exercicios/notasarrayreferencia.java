package exercicios;

public class notasarrayreferencia {

	public static void main(String[] args) {


		int [] notas = {10,20,30,60,70,80,72,82,54,67,79};
		int [] resultados = {0,0};
		conferir(notas, resultados);
		System.out.printf("Aprovados: %d%n", resultados[0]);
		System.out.printf("Reprovados: %d", resultados[1]);
		
	
	}


	public static void conferir(int [] n , int [] r  ) 
	{
	for(int c:n) {
		if (c>=60) {
			r[0]++;
		}
		else {
			r[1]++;
		}
	}	
		
		
		
	}
	
	
	

}
