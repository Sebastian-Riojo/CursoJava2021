package modulo4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int puesto; 
		
		System.out.println("Introduce el puesto: ");
		Scanner sc = new Scanner(System.in);
		puesto = sc.nextInt();
		
		if (puesto > 0 && puesto < 150) {
			
			if(puesto == 1) {
				
				System.out.println("Enhorabuena has quedado primero");
				
			}else if(puesto == 2) {
				
				System.out.println("Aunque no quedaras primero , quedaste segundo");
				
			}else if(puesto == 3) {
				
				System.out.println("Lo hiciste lo mejor que pudiste y al menos quedaste tercero");
				
			}else {
				
				System.out.println("Te quedaste fuera del podio , te deseo suerte para la próxima vez");
				
			}
			
		}else {
			
			System.out.println("Introduce un puesto válido");
			
		}
		
		sc.close();
		
	}
	
}
