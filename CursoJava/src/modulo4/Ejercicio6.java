package modulo4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int curso;
		
		System.out.println("Introduce el n�mero correspondiente al curso");
		Scanner sc = new Scanner(System.in);
		curso = sc.nextInt();
		
		if(curso >= 0 && curso <= 12) {
			
			if(curso == 0) {
				
				System.out.println("jasd�n de infantes");
				
			}else if(curso >= 1 && curso <= 6) {
				
				System.out.println("primaria");
				
			}else {
				
				System.out.println("secundaria");
				
			}
			
		}else {
			
			System.out.println("Introduce un curso v�lido (tiene que ser del 0 al 12)");
			
		}
		
	}

}
