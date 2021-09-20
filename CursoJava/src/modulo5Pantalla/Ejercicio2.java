package modulo5Pantalla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 {

	private JFrame frame;
	private JTextField texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 window = new Ejercicio2();
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
	public Ejercicio2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ejercicio 2");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel.setBounds(162, 11, 104, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce el texto");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 64, 118, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		texto = new JTextField();
		texto.setBounds(162, 65, 118, 20);
		frame.getContentPane().add(texto);
		texto.setColumns(10);
		
		JButton partir = new JButton("Partir");
		partir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int longitud = texto.getText().length();
				
				for(int i = 0; i < longitud; i++) {
					
					System.out.println(texto.getText().charAt(i));
					
				}
				
			}
		});
		partir.setBounds(172, 152, 89, 23);
		frame.getContentPane().add(partir);
	}
}
