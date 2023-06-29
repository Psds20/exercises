package loginSystem;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class WelcomePage {
	
	String userId;
	
	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}





	WelcomePage(String userIdOriginal){
	
	setUserId(userIdOriginal);	
		
	JFrame frame = new JFrame();	
	JLabel welcomeLabel = new JLabel();
	
	
	welcomeLabel.setFont(new Font(null,Font.ITALIC,20));
	welcomeLabel.setForeground(Color.BLUE);
	welcomeLabel.setText("Welcome to this page, "+ getUserId());
	welcomeLabel.setBounds(0, 10, 280, 50);
	
	
	frame.add(welcomeLabel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	frame.setSize(300, 350);
	frame.setVisible(true);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
