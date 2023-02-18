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
	JButton[] numeros = new JButton[10];

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
		
		
		for(int c = 0; c< 10; c++) {
			
			
			
		}
		
		

		JButton btn0 = new JButton("0");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btnmais = new JButton("+");
		JButton btnmenos = new JButton("-");
		JButton btnmulti = new JButton("*");
		JButton btndiv = new JButton("/");
		JButton btnpot = new JButton("^");
		JButton btnigual = new JButton("=");
		JButton btnC = new JButton("C");

		btn0.setBackground(UIManager.getColor("Button.shadow"));
		btn0.setBounds(10, 74, 77, 44);
		frame.getContentPane().add(btn0);

		btn1.setBackground(UIManager.getColor("Button.shadow"));
		btn1.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn1);

		btn2.setBackground(UIManager.getColor("Button.shadow"));
		btn2.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn2);

		btn3.setBackground(UIManager.getColor("Button.shadow"));
		btn3.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn3);
		
		
		btn4.setBackground(UIManager.getColor("Button.shadow"));
		btn4.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn4);

		btn5.setBackground(UIManager.getColor("Button.shadow"));
		btn5.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn5);
		
		
		btn6.setBackground(UIManager.getColor("Button.shadow"));
		btn6.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn6);

		btn7.setBackground(UIManager.getColor("Button.shadow"));
		btn7.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn7);

		btn8.setBackground(UIManager.getColor("Button.shadow"));
		btn8.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn8);
		
		btn9.setBackground(UIManager.getColor("Button.shadow"));
		btn9.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn9);

		btn2.setBackground(UIManager.getColor("Button.shadow"));
		btn2.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn2);
		
		btn2.setBackground(UIManager.getColor("Button.shadow"));
		btn2.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn2);

		btn2.setBackground(UIManager.getColor("Button.shadow"));
		btn2.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn2);
		
		btn2.setBackground(UIManager.getColor("Button.shadow"));
		btn2.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn2);
		
		btn2.setBackground(UIManager.getColor("Button.shadow"));
		btn2.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn2);
		
		btn2.setBackground(UIManager.getColor("Button.shadow"));
		btn2.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn2);
		
		btn2.setBackground(UIManager.getColor("Button.shadow"));
		btn2.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn2);
		
		btn2.setBackground(UIManager.getColor("Button.shadow"));
		btn2.setBounds(104, 74, 77, 44);
		frame.getContentPane().add(btn2);
		
		
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
