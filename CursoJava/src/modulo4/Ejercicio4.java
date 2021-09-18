package modulo4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String hijo = "hijos";
		String padre = "padres";
		String abuelo = "abuelos";
		
		System.out.println("Introduce una categoria , (debe ser \"hijos\" o \"padres\" o \"abuelos\")");
		Scanner sc = new Scanner(System.in);
		String categoria = sc.next();
		
		if(categoria.compareTo(hijo) == 0) {
			
			System.out.println("Pertenece a la categoria \'hijos\'");
			
		}else if(categoria.compareTo(padre) == 0) {
			
			System.out.println("Pertenece a la categoria \'padres\'");
			
		}else if(categoria.compareTo(abuelo) == 0) {
			
			System.out.println("Pertenece a la categoria \'abuelos\'");
			
		}else {
			
			System.out.println("No pertenece a ninguna categoría la palabara " + categoria);
			
		}
		sc.close();
	}

}
