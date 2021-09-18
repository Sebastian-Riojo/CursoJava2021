package modulo4;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		int puesto; 
		
		System.out.println("Introduce el puesto: ");
		Scanner sc = new Scanner(System.in);
		puesto = sc.nextInt();
		
		if (puesto > 0 && puesto < 150) {
			
			switch (puesto) {
			case 1: 
				
				System.out.println("Enhorabuena has quedado primero");
				
				break;
				
			case 2:
				
				System.out.println("Aunque no quedaras primero , quedaste segundo");
				
				break;
				
			case 3: 
				
				System.out.println("Lo hiciste lo mejor que pudiste y al menos quedaste tercero");
				
				break;
			default:
				
				System.out.println("Te quedaste fuera del podio , te deseo suerte para la próxima vez");
				
				break;
			}
			
		}else {
			
			System.out.println("Introduce un puesto válido");
			
		}
		
		sc.close();
		

	}

}
