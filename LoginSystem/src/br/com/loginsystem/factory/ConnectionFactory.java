package br.com.loginsystem.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	
private static final String USERNAME = "root";
private static final String PASSWORD = "root";
private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/login";



public static Connection CreateConnectionMySQL() throws Exception  {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
	
	return connection;
	
}

public static void main (String[] args) throws Exception {
	
	
	Connection con = CreateConnectionMySQL();
	
	if(con != null) {
		
		System.out.println("Conectado");
		con.close();
	}
	
}




}
