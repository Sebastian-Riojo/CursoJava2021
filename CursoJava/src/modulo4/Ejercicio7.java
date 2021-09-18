package modulo4;

import java.util.Scanner;

public class Ejercicio7 {

	//No lo hice con ands ni con ifs asi que el 10 lo tendria ya hecho 	
	
	public static void main(String[] args) {
		
		int numeroMayor = 0; 
		int num1,num2,num3;
		
		System.out.println("Introduce el primer número:");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número:");
		num2 = sc.nextInt();
		
		System.out.println("Introduce el tercer número:");
		num3 = sc.nextInt();
		
		int[] numeros = {num1 , num2 , num3};
		
		for(int i = 0; i < 3 ; i++) {
			
			if(numeros[i] > numeroMayor) {
				numeroMayor = numeros[i];
			}
			
		}
		
		System.out.println("El numero mayor de los tres es: " + numeroMayor);
		sc.close();
	}

}
