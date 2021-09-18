package modulo4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		float nota1,nota2,nota3;
		
		System.out.println("Introduce la primera nota: ");
		Scanner sc = new Scanner(System.in);
		nota1 = sc.nextFloat();
		
		System.out.println("Introduce la segunda nota: ");
		nota2 = sc.nextFloat();
		
		System.out.println("Introduce la tercera nota: ");
		nota3 = sc.nextFloat();
		
		float promedio = (nota1 + nota2 + nota3)/3f;
		
		if(promedio >= 5) {
			
			System.out.println("Estas aprobado ya que tu media es de: " + promedio);
			
		}else{
			
			System.out.println("Estas suspenso ya qur tu media es de: " + promedio);
			
		}
		
		sc.close();
		
	}

}
