package exercicios;

public class jogadormain {

	public static void main(String[] args) {
	

		int num = 0;
		
		jogador.alerta = true;
		
		jogador j1 = new jogador(++num);
		jogador j2 = new jogador(++num);
		jogador j3 = new jogador(++num);

		j1.addvidas();
		j1.addvidas();
		
		j2.addvidas();
		
		
		
		j1.info();
	    j2.info();
		j3.info();
	
	}

}
