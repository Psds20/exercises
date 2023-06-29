package loginSystem;

import java.util.HashMap;

public class InfoLogin {
	
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	
	InfoLogin(){
		
		loginInfo.put("pedro", "12345");
		loginInfo.put("dox", "dox123");
		loginInfo.put("jam", "janela");
		
	}
	public HashMap getLoginInfo() {
		
		return loginInfo;
		
	}
	
	
	

}
