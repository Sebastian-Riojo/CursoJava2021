package modulo4;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		int numero;
		System.out.println("Introduce el número para ver su tabla de multiplicar");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		for(int i = numero;i < (numero + 10) ; i++) {
			
			System.out.println("Tabla del " + i + " : ");
			
			for(int j = 0 ; j <= 10; j++) {
				
				int resultado = i  * j;
				System.out.println(i + " X " + j + " = " + resultado);
				
			} 
			
			System.out.println("\n");
			
		}
		
		sc.close();

	}

}
