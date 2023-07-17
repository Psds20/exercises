package notepad;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Notepad implements ActionListener {
	
JFrame frame = new JFrame();
JTextArea Paper = new JTextArea();
JMenuBar menu = new JMenuBar();

JMenu fileMenu = new JMenu("File");
JMenu fontMenu = new JMenu("Font Size");

JMenuItem saveMenu	=  new JMenuItem("Save");
JMenuItem loadMenu	=  new JMenuItem("Load");	

	 Notepad(){
		
		 
		 Paper.setBounds(0, 0, 1600, 900);
		
		 loadMenu.setMnemonic(KeyEvent.VK_F);
		 saveMenu.setMnemonic(KeyEvent.VK_S);
		 
		 
		 
		 loadMenu.addActionListener(this);
		 saveMenu.addActionListener(this);
		 
		 
		 
		 fileMenu.add(loadMenu);
		 fileMenu.add(saveMenu);
		 
		
		 
		 
		 
		 
		 
		 
		 menu.add(fileMenu);
		 menu.add(fontMenu);
	
		 
		 
		 
		 
		 
		 
	    frame.setJMenuBar(menu);
		frame.add(Paper);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1600, 900);
		frame.setLayout(null);
		frame.setVisible(true); 
		 
		 
		 
		 
		 
		 
		 
	 }

@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource() == loadMenu) {
		
		System.out.println("loading....");
		
		
	}
	if(e.getSource() == saveMenu) {
		
		System.out.println("Saving....");
		
		
		
	}
	
	
	
	
	 	
 }	 
	 
	 
	 

public static void main(String[] args) {
	
	
	Notepad notepad = new Notepad();
	
	
	
	
}


	
	
	
	
	
	
	
	
	
	
	
	
}
