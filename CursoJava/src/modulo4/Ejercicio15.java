package modulo4;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		char caracter; 
		String scan;
		System.out.println("Introduzca el caracter \"a\" , \"b\" o \"c\"");
		Scanner sc = new Scanner(System.in);
		scan = sc.next();
		
		if(scan.length() == 1) {
			
			caracter = scan.charAt(0);
			
			if((Character.compare(caracter, 'a') == 0) || (Character.compare(caracter, 'b') == 0) || (Character.compare(caracter, 'c') == 0)) {
				
				switch (caracter) {
				case 'a': 
					
					System.out.println("clase ‘a’:\r\n" + "tienen 4 ruedas y un motor");
					
					break;
					
				case 'b': 
					
					System.out.println("clase ‘b’:\r\n" + "tienen 4 ruedas, un motor, cierre centralizado y aire");
					
					break;
					
				case 'c': 
					
					System.out.println("clase ‘c’:\r\n" + "tienen 4 ruedas, un motor, cierre centralizado, aire, airbag");
					
					break;
				}
				
			}else {
				
				System.out.println("Introduce el caracter \"a\" , \"b\" o \"c\"");
				
			}
			
		}else{
			
			System.out.println("Introduce solo un caracter");
			
		}
		
	}

}
