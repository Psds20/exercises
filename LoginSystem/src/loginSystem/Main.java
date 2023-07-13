package loginSystem;

import java.util.ArrayList;
import java.util.List;

import loginDAO.LoginDAO;

public class Main {

	public static void main(String[] args) {
		
		LoginDAO loginDao = new LoginDAO();
		InfoLogin infoLogin = new InfoLogin();
		LoginPage loginPage = new LoginPage(infoLogin, loginDao); 
		
		//infoLogin.setUserID("pedrox");
		//infoLogin.setPassword("12345");
		//loginDao.Registar(infoLogin);
	
		
		
		
		
		
		
		
		
		
         
	}

}
