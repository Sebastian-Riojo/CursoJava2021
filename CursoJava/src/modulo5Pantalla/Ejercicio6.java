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

public class Ejercicio6 {

	private JFrame frame;
	private JTextField texto;
	private JLabel si;
	private JButton ver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio6 window = new Ejercicio6();
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
	public Ejercicio6() {
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
		
		JLabel lblNewLabel = new JLabel("Ejercicio 6");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(157, 11, 112, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce el String:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 60, 159, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contiene N\u00FAmeros");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(10, 105, 159, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		si = new JLabel("");
		si.setOpaque(true);
		si.setBackground(Color.CYAN);
		si.setFont(new Font("Tahoma", Font.BOLD, 16));
		si.setBounds(179, 105, 228, 20);
		frame.getContentPane().add(si);
		
		texto = new JTextField();
		texto.setBounds(179, 62, 228, 20);
		frame.getContentPane().add(texto);
		texto.setColumns(10);
		
		ver = new JButton("Ver");
		ver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = texto.getText().toLowerCase().replace(" ", "");
				int longitud = txt.length();
				boolean tiene = false;
				
				for (int x = 0; x < longitud; x++) {
					
			        char c = txt.charAt(x);
			        if (!(c >= 'a' && c <= 'z')) {
			            
			        	si.setText("Contiene nùmeros");
			        	tiene = true; 
			        	x = longitud;
			        }
			    }
				
				if(tiene) {
					si.setText("La cadena contiene números");
				}else {
					si.setText("La Cadena no contiene números");
				}
				
			}
		});
		ver.setFont(new Font("Tahoma", Font.BOLD, 16));
		ver.setBounds(161, 164, 89, 23);
		frame.getContentPane().add(ver);
	}
}
