package loginDAO;
	
import loginSystem.InfoLogin;
	
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import br.com.loginsystem.factory.ConnectionFactory;
	
public class LoginDAO {
		
		
public void Registar(InfoLogin login) {
					
String sql = "INSERT INTO usuario (username, senha) VALUES (?, ?)";	
Connection conn = null;
PreparedStatement pstm = null;	
							
try {
								
	conn = ConnectionFactory.CreateConnectionMySQL();
	pstm = conn.prepareStatement(sql);
								
								
								
	pstm.setString(1,login.getUserID());
								
	pstm.setString(2, login.getPassword());	
							
	pstm.execute();
								
}catch(Exception e) {
							
	e.printStackTrace();
}finally {
							
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
		
	


public List<InfoLogin> GetInfoLogin(){
	
	List<InfoLogin> users = new ArrayList<InfoLogin>();

	String sql = "SELECT username, senha FROM usuario";
	Connection conn = null;
	PreparedStatement pstm = null;
	
	
	ResultSet rset = null;
	
	try {
		conn = ConnectionFactory.CreateConnectionMySQL();
		pstm = conn.prepareStatement(sql);
		rset = pstm.executeQuery();
		
		while(rset.next()) {
			
			InfoLogin infoLogin = new InfoLogin();
			
			infoLogin.setUserID(rset.getString("username"));
			infoLogin.setPassword(rset.getString("senha"));
			
			users.add(infoLogin);
		}
		
		
	}catch(Exception e){
		
		e.printStackTrace();
		
	}finally {
		try {
			if(conn != null) {
				conn.close();
				
			}
			if(pstm != null) {
				pstm.close();
			}
			if(rset != null) {
				rset.close();
			}
			
			
		}catch(Exception e){
		e.printStackTrace();
		
		
		}
		
		
		
		
	}
	return users;
	

}
	
	
	
}





