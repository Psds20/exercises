package exercicios;

import java.nio.file.*;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path diretorio = Paths.get("C:/Users/Pedro/eclipse-workspace/exercicios/src/exercicios");
		Path arquivo = Paths.get("C:/Users/Pedro/eclipse-workspace/exercicios/src/exercicios/arquivoteste.txt");
		Path black = Paths.get("C:/Users/Pedro/Downloads/black.png");
		Path blackhole = Paths.get("C:/Users/Pedro/Downloads/blackhole.jpg");
		
		
		if(Files.isDirectory(diretorio)) {
			System.out.println("Diretório existe");
		}else {
			System.out.println("Diretório não existe");
		}
		if(Files.exists(arquivo)) {
			System.out.println("O caminho existe");
		}else{
			System.out.println("O caminho não existe");
		}
		try {
			System.out.println();
			System.out.println("Leitura de arquivo:");
			List<String> linhas = Files.readAllLines(arquivo);
		    linhas.forEach(linha -> System.out.println(linha));
		    
		    byte [] bytesblackhole = Files.readAllBytes(blackhole);
		    Files.write(black, bytesblackhole);
		    
		    
		    
		}
		catch(Exception e){
			System.out.println("Erro");
			
			
		}
		
		
		
		

	}

}
