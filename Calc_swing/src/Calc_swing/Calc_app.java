package Calc_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Calc_app {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc_app window = new Calc_app();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc_app() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 393, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(10, 11, 355, 52);
		frame.getContentPane().add(textField);

		textField.setColumns(10);

		JButton btnNewButton_1_4_11 = new JButton("0");
		JButton btnNewButton_1_4_6 = new JButton("1");
		JButton btnNewButton_1_4_7 = new JButton("2");
		JButton btnNewButton_1_4_8 = new JButton("3");
		JButton btnNewButton_1_4_1 = new JButton("4");
		JButton btnNewButton_1_4_2 = new JButton("5");
		JButton btnNewButton_1_4_3 = new JButton("6");
		JButton btnNewButton_1_4 = new JButton("7");
		JButton btnNewButton_1_5 = new JButton("8");
		JButton btnNewButton_1_2 = new JButton("9");
		JButton btnNewButton_1_4_12 = new JButton("+");
		JButton btnNewButton_1_4_13 = new JButton("-");
		JButton btnNewButton_1 = new JButton("*");
		JButton btnNewButton = new JButton("/");
		JButton btnNewButton_1_1 = new JButton("^");
		JButton btnNewButton_1_2_1 = new JButton("=");
		JButton btnNewButton_1_1_1 = new JButton("C");

		btnNewButton.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton.setBounds(10, 74, 77, 44);
		frame.getContentPane().add(btnNewButton);

		btnNewButton_1.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btnNewButton_1);

		btnNewButton_1_1.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1_1.setBounds(202, 74, 76, 44);
		frame.getContentPane().add(btnNewButton_1_1);

		btnNewButton_1_2.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1_2.setBounds(201, 129, 77, 44);
		frame.getContentPane().add(btnNewButton_1_2);

		btnNewButton_1_4.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1_4.setBounds(10, 129, 77, 44);
		frame.getContentPane().add(btnNewButton_1_4);

		btnNewButton_1_5.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1_5.setBounds(104, 129, 77, 44);
		frame.getContentPane().add(btnNewButton_1_5);

		btnNewButton_1_4_1.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1_4_1.setBounds(10, 184, 77, 44);
		frame.getContentPane().add(btnNewButton_1_4_1);

		btnNewButton_1_4_2.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1_4_2.setBounds(104, 184, 77, 44);
		frame.getContentPane().add(btnNewButton_1_4_2);

		btnNewButton_1_4_3.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1_4_3.setBounds(201, 184, 77, 44);
		frame.getContentPane().add(btnNewButton_1_4_3);

		btnNewButton_1_4_6.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1_4_6.setBounds(10, 239, 77, 44);
		frame.getContentPane().add(btnNewButton_1_4_6);

		btnNewButton_1_4_7.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1_4_7.setBounds(104, 239, 77, 44);
		frame.getContentPane().add(btnNewButton_1_4_7);

		btnNewButton_1_4_11.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1_4_11.setForeground(Color.BLACK);

		btnNewButton_1_4_12.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1_4_12.setBounds(104, 294, 77, 44);
		frame.getContentPane().add(btnNewButton_1_4_12);

		btnNewButton_1_4_13.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1_4_13.setBounds(201, 294, 77, 44);
		frame.getContentPane().add(btnNewButton_1_4_13);

		btnNewButton_1_4_8.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1_4_8.setBounds(201, 239, 77, 44);
		frame.getContentPane().add(btnNewButton_1_4_8);

		btnNewButton_1_4_11.setBounds(10, 294, 77, 44);
		frame.getContentPane().add(btnNewButton_1_4_11);
		
		btnNewButton_1_2_1.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1_2_1.setBounds(288, 129, 77, 209);
		frame.getContentPane().add(btnNewButton_1_2_1);
		
		btnNewButton_1_1_1.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1_1_1.setBounds(288, 74, 76, 44);
		frame.getContentPane().add(btnNewButton_1_1_1);

		
		
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		
	       
		
		
		btnNewButton_1_4_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnNewButton_1_4_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});

		btnNewButton_1_4_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}

		});

		btnNewButton_1_4_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}

		});

		btnNewButton_1_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}

		});

		btnNewButton_1_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}

		});

		btnNewButton_1_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}

		});
		
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}

		});
		
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}

		});

		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}

		});
		
		btnNewButton_1_4_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "+");
			}
		});
		

		btnNewButton_1_4_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "-");
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "*");
			}

		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "/");
			}

		});

		
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "^");
			}

		});

		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "=");
			}
		});
		


	}
}
