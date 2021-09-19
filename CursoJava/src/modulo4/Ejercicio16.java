package modulo4;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		int numero;
		int multiplo;
		int resultado; 
		System.out.println("Introduce el número para ver su tabla de multiplicar");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		for(int i = 0; i < 11; i++) {
			
			multiplo = i;
			resultado = multiplo * numero;
			System.out.println(numero + " X " + multiplo + " = " + resultado);
			
		}
		
		sc.close();

	}

}
