package modulo5Pantalla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio5 {

	private JFrame frame;
	private JTextField texto;
	private JLabel resultado;
	private JButton partir;
	private JLabel lblNewLabel_1_2;
	private JLabel arroba;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio5 window = new Ejercicio5();
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
	public Ejercicio5() {
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
		
		JLabel lblNewLabel = new JLabel("Ejercicio5");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(158, 11, 118, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce el texto: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 62, 159, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		texto = new JTextField();
		texto.setBounds(179, 64, 245, 20);
		frame.getContentPane().add(texto);
		texto.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Resultado");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(10, 104, 159, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		resultado = new JLabel("");
		resultado.setOpaque(true);
		resultado.setBackground(Color.CYAN);
		resultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		resultado.setBounds(179, 104, 245, 20);
		frame.getContentPane().add(resultado);
		
		partir = new JButton("Partir");
		partir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = texto.getText().replace(" ", "").toLowerCase();
				int longitud = txt.length();
				
				for(int i = 0; i < longitud ; i++) {
					
					if(txt.charAt(i) == '@') {
						
						arroba.setText(Integer.toString(i + 1));
						String result = txt.replace('@', ' ');
						String[] partes = result.split(" ");
						String parte1 = partes[0];
						String parte2 = partes[1];
						resultado.setText(parte1 + " y " + parte2);
						
					}
					
				}
				
			}
		});
		partir.setFont(new Font("Tahoma", Font.BOLD, 16));
		partir.setBounds(168, 191, 89, 23);
		frame.getContentPane().add(partir);
		
		lblNewLabel_1_2 = new JLabel("Posici\u00F3n @");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(10, 142, 159, 20);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		arroba = new JLabel("");
		arroba.setOpaque(true);
		arroba.setFont(new Font("Tahoma", Font.BOLD, 16));
		arroba.setBackground(Color.CYAN);
		arroba.setBounds(179, 142, 245, 20);
		frame.getContentPane().add(arroba);
	}
}
