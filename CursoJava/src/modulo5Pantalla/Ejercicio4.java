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

public class Ejercicio4 {

	private JFrame frame;
	private JTextField texto;
	private JLabel consonantes;
	private JLabel vocales;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 window = new Ejercicio4();
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
	public Ejercicio4() {
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
		
		JLabel lblNewLabel = new JLabel("Ejercicio4");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		lblNewLabel.setBounds(165, 11, 106, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce el texto");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 64, 148, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		texto = new JTextField();
		texto.setBounds(165, 66, 206, 20);
		frame.getContentPane().add(texto);
		texto.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Num consonantes");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 103, 148, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Num vocales");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(10, 138, 148, 20);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		vocales = new JLabel("");
		vocales.setFont(new Font("Tahoma", Font.PLAIN, 14));
		vocales.setOpaque(true);
		vocales.setBackground(Color.CYAN);
		vocales.setHorizontalAlignment(SwingConstants.CENTER);
		vocales.setBounds(165, 109, 84, 14);
		frame.getContentPane().add(vocales);
		
		consonantes = new JLabel("");
		consonantes.setOpaque(true);
		consonantes.setHorizontalAlignment(SwingConstants.CENTER);
		consonantes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		consonantes.setBackground(Color.CYAN);
		consonantes.setBounds(165, 143, 84, 14);
		frame.getContentPane().add(consonantes);
		
		JButton calcular = new JButton("Calcular");
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int vocal = 0;
				int consonante = 0;
				
				String txt = texto.getText().replace(" ", "").toLowerCase();
				
				for(int i = 0; i < txt.length(); i++) {
					
					char car = txt.charAt(i);
					if(Character.compare(car, 'a') == 0 ||Character.compare(car, 'e') == 0||Character.compare(car, 'i') == 0||
							Character.compare(car, 'o') == 0||Character.compare(car, 'u') == 0) {
						vocal++;
					}else {
						consonante++;
					}
					
				}
				
				vocales.setText(Integer.toString(vocal));
				consonantes.setText(Integer.toString(consonante));
				
			}
		});
		calcular.setFont(new Font("Tahoma", Font.BOLD, 14));
		calcular.setBounds(165, 186, 89, 23);
		frame.getContentPane().add(calcular);
	}

}
