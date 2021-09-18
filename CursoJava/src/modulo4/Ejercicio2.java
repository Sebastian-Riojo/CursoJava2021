package modulo4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Introduce el numero: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		int pI = numero % 2;
	
		if(pI == 0) {
			
			System.out.println("El número " + numero + " es par ya que su resto da 0");
			
		}else {
			
			System.out.println("El número " + numero + " es impar ya que su resto no da 0");
			
		}
		
		sc.close();

	}

}
