package br.com.contato.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;


import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;

public class ContatoDAO {

	/*
	C - CREATE
	R - READ
	U - UPDATE
	D - DELETE
	 */
	
public void save(Contato contato) {
	
	String sql = "INSERT INTO contatos(nome, idade, datacadastro) VALUES(?, ?, ?)";
	
	
	  Connection conn = null;
	  PreparedStatement pstm = null;
	
	
		try {
			
			
			//Criar uma conexão com o banco de dados
			conn = ConnectionFactory.CreateConnectionToMySQL();
			
			
			//Criamos um PreparedStatement, para executar uma query
            pstm = conn.prepareStatement(sql);
            
            
            //Adicionar os valores que são esperados pela query
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setDate(3,  new Date(contato.getDatadecadastro().getTime()));
		     
			//executar query
		    pstm.execute(); 
		      
		
		
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			//fechar as conexões
			try {
				
				if(pstm != null){
					
					pstm.close();
					
				}
				if(conn!=null) {
					conn.close();
					
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
			
			
			
		}
}
		
		
	
	
}
	
