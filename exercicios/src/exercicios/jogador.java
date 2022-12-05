package exercicios;

public class jogador {
	
	
	 private final int maxvidas = 3;
	 private int num;
	 private int vidas;
	 static boolean alerta = false;
	 
	 
	 
	 public jogador(int num){
		 
		 
		 this.vidas = 1; 
		 this.num = num;
	     num++;
	 
	 
	 }
	 
	 
	 
	 
	 public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}




	public void addvidas() {
		if(this.vidas < 3) {
        this.vidas++;	
		}	
	}
	 
	 public void info() {
		 
		 System.out.printf("%nN°: "+this.getNum());
		 System.out.printf("%nqtd de vidas: "+this.getVidas());
		 System.out.printf("%nAlerta: "+ alerta);
		 System.out.printf("%n --------------------------------");
		 
		 
	 }
	 
	 
	 

}
