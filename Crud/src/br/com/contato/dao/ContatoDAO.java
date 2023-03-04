package br.com.contato.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



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


	
	public void update(Contato contato) {
		
		
		String sql = "update contatos set nome = ?, idade = ?, datacadastro = ? "+"WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		
		try {
			//Criar conexão SQL
			
			conn = ConnectionFactory.CreateConnectionToMySQL();
			
			//Criar PrepareStatement
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setDate(3, new Date(contato.getDatadecadastro().getTime()));
			pstm.setInt(4, contato.getId());
			
			pstm.execute();
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}finally{
			
			try {
				if(pstm!=null) {
					
					pstm.close();
				}
				
				if(conn!= null) {
					
					conn.close();
					
				}
				
				
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
			
		}
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	

	public List<Contato> Getcontatos(){


		List<Contato> contatos = new ArrayList<Contato>();

		String sql = "SELECT * FROM CONTATOS";

		Connection conn = null;
		PreparedStatement pstm = null;
		//Classe que vai recuperar classe do banco de dados(SELECT)
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.CreateConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while(rset.next()) {

				Contato contato = new Contato();

				contato.setNome(rset.getString("nome"));
				contato.setId(rset.getInt("id"));
				contato.setDatadecadastro(rset.getDate("datacadastro"));
				contato.setIdade(rset.getInt("idade"));

				contatos.add(contato);		
			}
		}catch(Exception e) {
			e.printStackTrace();		
		}finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();

				}
				if(rset != null) {
					rset.close();
				}

			}catch(Exception e) {
				e.printStackTrace();
			}
			return contatos;
		}

	}


	
	public void delete(Contato contato) {
		
		String sql = "DELETE FROM CONTATOS WHERE ID = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = ConnectionFactory.CreateConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			
			pstm.setInt(1, contato.getId());	
			
			pstm.execute();
			
		}catch(Exception e) {
			
			
		}finally {
			
			try {
			if(pstm != null) {
				
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













