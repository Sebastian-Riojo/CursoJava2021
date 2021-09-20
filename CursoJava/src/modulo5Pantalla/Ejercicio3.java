package modulo5Pantalla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3 {

	private JFrame frame;
	private JTextField nombre;
	private JTextField apellido;
	private JLabel resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 window = new Ejercicio3();
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
	public Ejercicio3() {
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
		
		JLabel lblNewLabel = new JLabel("Ejercicio 3:");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		lblNewLabel.setBounds(148, 11, 134, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 61, 62, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(10, 101, 62, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		nombre = new JTextField();
		nombre.setBounds(107, 62, 123, 20);
		frame.getContentPane().add(nombre);
		nombre.setColumns(10);
		
		apellido = new JTextField();
		apellido.setColumns(10);
		apellido.setBounds(107, 102, 123, 20);
		frame.getContentPane().add(apellido);
		
		resultado = new JLabel("");
		resultado.setOpaque(true);
		resultado.setBackground(Color.CYAN);
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setFont(new Font("Times New Roman", Font.BOLD, 16));
		resultado.setBounds(10, 148, 220, 20);
		frame.getContentPane().add(resultado);
		
		JButton btnNewButton = new JButton("Juntar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nom = nombre.getText();
				String ap = apellido.getText();
				resultado.setText(nom + " " + ap);
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(169, 193, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
