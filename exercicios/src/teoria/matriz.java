package teoria;

import java.security.SecureRandom;

public class matriz {

	public static void main(String[] args) {
		
		int [][] num = new int [5] [3]; 
		
	  
	
	    
	    for(int i = 0; i < 5; i++) {
	    	for(int j = 0; j < 3; j++) {	
	    		num[i][j] = new SecureRandom().nextInt(100);
	    	}
	    }
	    for(int i = 0; i < 5; i++) {
	    	for(int j = 0; j < 3; j++) {	
	    		System.out.printf("%2d /", num[i][j]);
	    	}
	    	System.out.printf("%n");
	    }
	    
	    
	    
	    
	    
	}

}
