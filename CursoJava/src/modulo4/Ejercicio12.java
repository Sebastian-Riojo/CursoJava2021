package modulo4;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		//Utilice solo ands ya que no veía donde poder usar los or 
		
		int numero;
		
		System.out.println("Introduce el número para ver a que docena pertenece: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		if(numero > 0) {
			
			if(numero <= 12) {
				
				System.out.println("Pertenece a la primera docena ya que el número " + numero + " esta entre el 1 y el 12");
				
			}else if(numero > 12 && numero <= 24) {
				
				System.out.println("Pertenece a la segunda docena ya que el número " + numero + " esta entre el 13 y el 24");
				
			}else if(numero > 24 && numero <= 36) {
				
				System.out.println("Pertenece a la tercera docena ya que el número " + numero + " esta entre el 25 y el 36");
				
			}else {
				
				System.out.println("El número " + numero + " esta fuera de raando de las tres docenas ya que supera el 36");
				
			}
			
		}else {
			
			System.out.println("Introduce un número positivo o que sea mayor que 0");
			
		}
		sc.close();
		
		
		
	}

}
