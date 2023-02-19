package br.com.agenda.factory;


import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
	
//Nome do usuário do mysqql	
private static final String USERNAME = "root";	

//Nome da senha do mysqql	
private static final String PASSWORD = "root";	

//caminho do banco de dados, porta, nome do banco de dados
private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";


//conexão com o banco de dados

public static Connection CreateConnectionToMySQL() throws Exception {
	//faz com que a classe seja carregada pela JVM
	Class.forName("com.mysql.jdbc.Driver");
	
	//cria a conexão com o banco de dados
	Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
	
	
	
	return connection;
	
}

public static void main(String[] args) throws Exception {
	
	Connection con = CreateConnectionToMySQL();
	
	if(con != null) {
		
		System.out.println("Conectado");
		con.close();
	}
	
	
	
	
}


	

}
