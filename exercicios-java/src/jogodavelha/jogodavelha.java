package jogodavelha;


import java.util.Scanner;

public class jogodavelha {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);	
	
	
	
	char simboloatual = 'X';
    char[][] velha =  new char [3][3];
    boolean game = true;
    String vitoria;
    iniciarjogo(velha);
    
    while(game) {
    	
    	
    	desenharcampo(velha);
    
    
   
    	vitoria = verificarvitoria(velha);
    	if(vitoria.equals("")) {
    		if(simboloatual == 'X') {
				simboloatual = 'O';
			}
			else {
				simboloatual = 'X';
			}	
    		System.out.printf("jogador %c venceu%n", simboloatual);
    		break;
    	}
    	
    	 try {
    		if(verificarjogada(velha, jogar(ler, simboloatual), simboloatual)) {
    			
    			if(simboloatual == 'X') {
    				simboloatual = 'O';
    			}
    			else {
    				simboloatual = 'X';
    			}	
    		}
    		limpartela();
   }
   
   catch(Exception e) {
   System.out.println("erro");
   }
   
    	 }
System.out.println("Fim de jogo");

    }
    	
	public static void desenharcampo(char[][] v) {
		System.out.println("   0  1   2");
		System.out.printf(" 0 %c | %c | %c%n", v[0][0], v[0][1], v[0][2]);
		System.out.printf(" 1 %c | %c | %c%n", v[1][0], v[1][1], v[1][2]);
		System.out.printf(" 2 %c | %c | %c%n", v[2][0], v[2][1], v[2][2]);
	}
	public static  void limpartela() {
		for(int c = 0; c < 200;c++) {
			System.out.println();
		}
	}
	
	public static boolean verificarjogada(char [][] velha, int[] pos, char simatual) {
		
		if(velha[pos[0]][pos[1]] == ' ') {
			velha[pos[0]][pos[1]] = simatual;
			return true;
		}else {
			
			return false;
		}
	}
	
	
	
	public static int[] jogar(Scanner ler, char simbatual) {
		int pos[] = new int[2];
		System.out.printf("jogada do %c%n", simbatual);
		System.out.println("Linha que vc quer jogar:");
	    pos[0] = ler.nextInt();
	    System.out.println("Coluna que vc quer jogar:");
	    pos[1] = ler.nextInt();
	    return pos;
		
		
	}
	public static void iniciarjogo(char [][] velha) {
    for(int i = 0; i < 3; i++) {
    	for(int j = 0; j < 3; j++) {
    		velha[i][j] = ' ';
    	}
    }
	}
	
	
	public static String verificarvitoria(char[][] velha) {
		
		//diagonais
	    if(velha[1][1] == 'X' | velha[1][1] ==  'O' ){
		if((velha[0][0] == velha[1][1] && velha[1][1] == velha[2][2]) | (velha[0][0] == velha[1][1] && velha[1][1] == velha[2][2]) ) {
		return "";	
		}
		}
	    //colunas
	    else if((velha[0][0] == 'X' && velha[0][1] == 'X'  && velha[0][2] == 'X') | (velha[0][0] == 'O' && velha[0][1] == 'O'  && velha[0][2] == 'O')) {
			return "";		
		}
	    else if((velha[1][0] == 'X' && velha[1][1] == 'X'  && velha[1][2] == 'X') | (velha[1][0] == 'O' && velha[1][1] == 'O'  && velha[1][2] == 'O')) {
			return "";		
		}
	    else if((velha[2][0] == 'X' && velha[2][1] == 'X'  && velha[2][2] == 'X') | (velha[2][0] == 'O' && velha[2][1] == 'O'  && velha[2][2] == 'O')) {
			return "";		
		}
	    //linhas
	    else if((velha[0][0] == 'X' && velha[1][0] == 'X'  && velha[2][0] == 'X') | (velha[0][0] == 'O' && velha[1][0] == 'O'  && velha[2][0] == 'O')) {
			return "";		
		}
	    else if((velha[0][1] == 'X' && velha[1][1] == 'X'  && velha[2][1] == 'X') | (velha[0][1] == 'O' && velha[1][1] == 'O'  && velha[2][1] == 'O')) {
			return "";		
		}
	    else if((velha[0][2] == 'X' && velha[1][2] == 'X'  && velha[2][2] == 'X') | (velha[0][2] == 'O' && velha[1][2] == 'O'  && velha[2][2] == 'O')) {
			return "";		
		}
	  
	  return " ";
	   
		
		
	}
	
}
