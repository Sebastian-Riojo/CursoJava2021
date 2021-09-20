package modulo5Pantalla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla_String {

	private JFrame frame;
	private JTextField txtIngreseTexto;
	private JLabel lblMayuscula_result;
	private JLabel lblMinúscula_result;
	private JLabel lblOpor2Result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_String window = new Pantalla_String();
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
	public Pantalla_String() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Manejo de String");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		lblNewLabel.setBounds(148, 11, 192, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese Texto");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 63, 126, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtIngreseTexto = new JTextField();
		txtIngreseTexto.setBounds(158, 67, 126, 20);
		frame.getContentPane().add(txtIngreseTexto);
		txtIngreseTexto.setColumns(10);
		
		JLabel lblMayuscula = new JLabel("Mayuscula");
		lblMayuscula.setBackground(Color.CYAN);
		lblMayuscula.setHorizontalAlignment(SwingConstants.CENTER);
		lblMayuscula.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMayuscula.setBounds(10, 122, 126, 20);
		frame.getContentPane().add(lblMayuscula);
		
		JLabel lblMinúscula = new JLabel("Min\u00FAscula");
		lblMinúscula.setHorizontalAlignment(SwingConstants.CENTER);
		lblMinúscula.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMinúscula.setBounds(10, 163, 126, 20);
		frame.getContentPane().add(lblMinúscula);
		
		JLabel lblOpor2 = new JLabel("\"O\"------->2");
		lblOpor2.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpor2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblOpor2.setBounds(10, 204, 126, 20);
		frame.getContentPane().add(lblOpor2);
		
		lblMayuscula_result = new JLabel("");
		lblMayuscula_result.setOpaque(true);
		lblMayuscula_result.setForeground(Color.BLACK);
		lblMayuscula_result.setBackground(Color.CYAN);
		lblMayuscula_result.setHorizontalAlignment(SwingConstants.CENTER);
		lblMayuscula_result.setFont(new Font("Script MT Bold", Font.BOLD, 16));
		lblMayuscula_result.setBounds(148, 121, 126, 20);
		frame.getContentPane().add(lblMayuscula_result);
		
		lblMinúscula_result = new JLabel("");
		lblMinúscula_result.setOpaque(true);
		lblMinúscula_result.setHorizontalAlignment(SwingConstants.CENTER);
		lblMinúscula_result.setForeground(Color.BLACK);
		lblMinúscula_result.setFont(new Font("Script MT Bold", Font.BOLD, 16));
		lblMinúscula_result.setBackground(new Color(0, 255, 255));
		lblMinúscula_result.setBounds(148, 163, 126, 20);
		frame.getContentPane().add(lblMinúscula_result);
		
		lblOpor2Result = new JLabel("");
		lblOpor2Result.setOpaque(true);
		lblOpor2Result.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpor2Result.setForeground(Color.BLACK);
		lblOpor2Result.setFont(new Font("Script MT Bold", Font.BOLD, 16));
		lblOpor2Result.setBackground(Color.CYAN);
		lblOpor2Result.setBounds(148, 204, 126, 20);
		frame.getContentPane().add(lblOpor2Result);
		
		JButton calcular = new JButton("Calcular");
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblMayuscula_result.setText(txtIngreseTexto.getText().toUpperCase());
				lblMinúscula_result.setText(txtIngreseTexto.getText().toLowerCase());
				lblOpor2Result.setText(txtIngreseTexto.getText().toLowerCase().replace('o', '2'));
				
			}
		});
		calcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		calcular.setBounds(311, 163, 89, 23);
		frame.getContentPane().add(calcular);
	}
}
