package br.com.agenda.main;



import java.util.Date;

import br.com.agenda.model.Contato;
import br.com.contato.dao.ContatoDAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContatoDAO contatodao = new ContatoDAO();
		Contato contato = new Contato();

		contato.setNome("bla");
		contato.setIdade(20);
        contato.setDatadecadastro(new Date());
        
      
		contatodao.save(contato);
		
		
	}

}
