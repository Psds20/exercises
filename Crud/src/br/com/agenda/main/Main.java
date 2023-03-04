package br.com.agenda.main;



import java.util.Date;

import br.com.agenda.model.Contato;
import br.com.contato.dao.ContatoDAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContatoDAO contatodao = new ContatoDAO();
		Contato contato = new Contato();

		contato.setNome("julia silva");
		contato.setIdade(22);
        contato.setDatadecadastro(new Date());
        contato.setId(4);
        
        
        contatodao.delete(contato);
        
        //contatodao.update(contato);
       // contatodao.save(contato);
		
        
        
        
        
       /* 
        for(Contato c:contatodao.Getcontatos()) {
        	System.out.println("Nome:"+c.getNome()+"\nidade:"+c.getIdade());
        	
        	
        }
        */
		
	}

}
