package loginSystem;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import loginDAO.LoginDAO;

public class LoginPage implements ActionListener {

JFrame frame = new JFrame();	
JButton loginButton = new JButton("Login");
JButton registerButton = new JButton("Register");
JTextField idTextField = new JTextField();
JPasswordField passwordField = new JPasswordField();
JLabel idLabel = new JLabel("UserID:");
JLabel passwordLabel = new JLabel("Password:");
JLabel messageLabel = new JLabel();
InfoLogin log = new InfoLogin();
LoginDAO DAO = new LoginDAO();
String password, user;
	
	LoginPage(InfoLogin LoginInfoOriginal, LoginDAO loginDAO){
		
		DAO =  loginDAO;
		log = LoginInfoOriginal;
		
		idLabel.setBounds(40, 50, 75, 25);
		passwordLabel.setBounds(40, 100, 75, 25);
		
		idTextField.setBounds(40, 70, 200, 25);
		passwordField.setBounds(40, 120, 200, 25);
		
		messageLabel.setBounds(40,160,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		
		loginButton.setBounds(40, 230, 90, 30);
		loginButton.addActionListener(this);
		loginButton.setFocusable(false);
		
		
		registerButton.setBounds(150, 230, 90, 30);
		registerButton.addActionListener(this);
		registerButton.setFocusable(false);
		
		frame.add(registerButton);
		frame.add(loginButton);
		frame.add(passwordField);
		frame.add(idTextField);
		frame.add(messageLabel);
		frame.add(idLabel);
		frame.add(passwordLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(300, 350);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
			if(e.getSource() ==  loginButton) {
				log.setUserID(String.valueOf(idTextField.getText()));
				log.setPassword(String.valueOf(passwordField.getPassword()));
				
				for(InfoLogin n: DAO.GetInfoLogin()) {
					
					if(n.getUserID().equals(log.getUserID())) {
						if(n.getPassword().equals(log.getPassword())) {
							messageLabel.setForeground(Color.green);
							messageLabel.setText("Valid Login");
							frame.dispose();
							WelcomePage welcomePage = new WelcomePage(log.getUserID());
							
						}
						
						
					}
					
					
				}
				messageLabel.setForeground(Color.RED);
				messageLabel.setText("Invalid Login");
				
			    
				
			}
			
				
			if(e.getSource() ==  registerButton) {
				
				int i = 0;
			
				
				
				log.setUserID(idTextField.getText());
				log.setPassword(String.valueOf(passwordField.getPassword()));
				

				
				
				
                for(InfoLogin n:DAO.GetInfoLogin()) {
                	if(n.getUserID().equals(log.getUserID())) {
                		i = 1;
    					break;
                		
                	}
                	
                }
				
				if(i == 1) {
					
					messageLabel.setForeground(Color.RED);
					messageLabel.setText("Register failed");	
					
				}
				else {
				
				DAO.Registar(log);
				messageLabel.setForeground(Color.green);
				messageLabel.setText("Register successful");
			
				}
                
                
                
                }
			
		
			
		
	}
	

	
	
	
}
