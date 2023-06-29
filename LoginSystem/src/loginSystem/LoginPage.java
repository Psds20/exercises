package loginSystem;

import java.awt.*;
import java.util.HashMap;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {

JFrame frame = new JFrame();	
JButton loginButton = new JButton("Login");
JButton resetButton = new JButton("Reset");
JTextField idTextField = new JTextField();
JPasswordField passwordField = new JPasswordField();
JLabel idLabel = new JLabel("UserID:");
JLabel passwordLabel = new JLabel("Password:");
JLabel messageLabel = new JLabel();
String userId, password;

HashMap<String, String> LoginInfo = new HashMap<String, String>();	
	
	LoginPage(HashMap<String, String> LoginInfoOriginal){
		
		LoginInfo = LoginInfoOriginal;
		
		idLabel.setBounds(40, 50, 75, 25);
		passwordLabel.setBounds(40, 100, 75, 25);
		
		idTextField.setBounds(40, 70, 200, 25);
		passwordField.setBounds(40, 120, 200, 25);
		
		messageLabel.setBounds(40,160,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		
		loginButton.setBounds(40, 230, 90, 30);
		loginButton.addActionListener(this);
		loginButton.setFocusable(false);
		
		
		resetButton.setBounds(150, 230, 90, 30);
		resetButton.addActionListener(this);
		resetButton.setFocusable(false);
		
		frame.add(resetButton);
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
			userId = String.valueOf(idTextField.getText());
			password = String.valueOf(passwordField.getPassword());
		    
			
			
			if(LoginInfo.containsKey(userId)) {
			
				if(LoginInfo.get(userId).equals(password)) {
					messageLabel.setForeground(Color.GREEN);
					messageLabel.setText("Correto");
					frame.dispose();
					WelcomePage WelcomePage = new  WelcomePage(userId);
					
					
				}else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Senha incorreta");
				
					
					
				}
				
				
				
			}
			
			
			
			
		}
		
		
	}



	
	
	
}
