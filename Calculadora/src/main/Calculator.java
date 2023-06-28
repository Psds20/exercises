package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;





public class Calculator implements ActionListener  {

	JFrame frame;
	JTextField textField;
	JButton[] numbersButtuons = new JButton[10];
	JButton[] functionsButtons = new JButton[8];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, clrButton, equButton, delButton;
	JPanel panel;
	Font myFont = new Font("Ink Free", Font.BOLD, 30);
	
	double num1= 0, num2 = 0, result = 0;
	char operator;
	
   
	Calculator(){
			
	    	frame = new JFrame("Calculator");
	    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	frame.setSize(420, 550);
	    	frame.setLayout(null);
	    	
	        textField = new JTextField();
	    	textField.setBounds(50, 25, 300, 50);
	    	textField.setFont(myFont);
	    	
	    	
	    	addButton = new JButton("+");
	    	subButton = new JButton("-");
	    	mulButton = new JButton("*");
	    	divButton = new JButton("/");
	    	decButton = new JButton(".");
	    	equButton = new JButton("=");
	    	clrButton = new JButton("Clear");
	    	delButton = new JButton("Delete");
	    	
	    	functionsButtons[0] = addButton;
	    	functionsButtons[1] = subButton;
	    	functionsButtons[2] = mulButton;
	    	functionsButtons[3] = divButton;
	    	functionsButtons[4] = decButton;
	    	functionsButtons[5] = equButton;
	    	functionsButtons[6] = clrButton;
	    	functionsButtons[7] = delButton;
	    	
	    	for(int c =0; c < 8; c++) {
	    		
	    		functionsButtons[c].addActionListener(this);
	    		functionsButtons[c].setFont(myFont);
	    		functionsButtons[c].setFocusable(false);
	    	}
	    	for(int c = 0; c < 10; c++) {
	    		numbersButtuons[c] = new JButton(String.valueOf(c));
	    		numbersButtuons[c].addActionListener(this);
	    		numbersButtuons[c].setFont(myFont);
	    		numbersButtuons[c].setFocusable(false);
	    		
	    	} 
	    	delButton.setBounds(50,430,145,50);
	    	clrButton.setBounds(205,430,145,50);
	    	
	    	panel = new JPanel();
	    	panel.setBounds(50, 100, 300, 300);
	    	panel.setLayout(new GridLayout(4, 4, 10, 10));
	    	
	    	panel.add(numbersButtuons[1]);
	    	panel.add(numbersButtuons[2]);
	    	panel.add(numbersButtuons[3]);
	    	panel.add(addButton);
	    	panel.add(numbersButtuons[4]);
	    	panel.add(numbersButtuons[5]);
	    	panel.add(numbersButtuons[6]);
	    	panel.add(subButton);
	    	panel.add(numbersButtuons[7]);
	    	panel.add(numbersButtuons[8]);
	    	panel.add(numbersButtuons[9]);
	    	panel.add(mulButton);
	    	panel.add(decButton);
	    	panel.add(numbersButtuons[0]);
	    	panel.add(equButton);
	    	panel.add(divButton);
	    	
	    	frame.add(panel);
	    	frame.add(delButton);
	    	frame.add(clrButton);
	    	frame.add(textField);
	    	frame.setVisible(true);
	     }
    	
    	




	public static void main(String[] args) {

	Calculator calc = new Calculator();
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int c = 0; c < 10; c++) {
			if(e.getSource() == numbersButtuons[c]) {
			textField.setText(textField.getText().concat(String.valueOf(c)));
			}
		}
		
		if(e.getSource()==decButton) {
		textField.setText(textField.getText().concat("."));
		}
		if(e.getSource() == addButton) {
			
			num1 = Double.parseDouble(textField.getText());
			operator = '+';
			textField.setText("");
		}
       if(e.getSource() == subButton) {
			
			num1 = Double.parseDouble(textField.getText());
			operator = '-';
			textField.setText("");
		}
       if(e.getSource() == mulButton) {
			
			num1 = Double.parseDouble(textField.getText());
			operator = '*';
			textField.setText("");
		}
       if(e.getSource() == divButton) {
			
    			num1 = Double.parseDouble(textField.getText());
    			operator = '/';
    			textField.setText("");
    		}
      if(e.getSource()==equButton) {
    	  num2=Double.parseDouble(textField.getText()); 
    	  
    	  switch(operator) {
    	  case '+':
    		  result = num1 + num2;
    		  break;
    	  case '-':
    		  result = num1 - num2;
    		  break;
    	  case '/':
    		  result = num1 / num2;
    		  break;
    	  case '*':	  
    		  result = num1 * num2;
    		  break;
    	  }
    	  textField.setText(String.valueOf(result));
    	  num1 = result;
    	  
      }
      if(e.getSource() == clrButton) {
    	  textField.setText("");
      }
      if(e.getSource() == delButton) {
    	  String string = textField.getText();
    	  textField.setText("");
    	  for(int c = 0; c<string.length()-1;c++) {
    		  textField.setText(textField.getText()+string.charAt(c));
    	  }
      }
		
	}

}
