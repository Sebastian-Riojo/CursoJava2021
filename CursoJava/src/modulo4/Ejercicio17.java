package modulo4;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		int numero;
		int multiplo;
		int resultado; 
		System.out.println("Introduce el número para ver su tabla de multiplicar");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		int suma = 0;
		int sumando = 0;
		
		int n = 0;
		int a1 = numero; 
		int d = 2;
		int aN;
		
		int sumab = 0;
		
		for(int i = 0; i < 11; i++) {
			
			multiplo = i;
			resultado = multiplo * numero;
			
			if((resultado % 2) == 0) {
				
				sumando = resultado;
				suma += sumando;
				
			}
			
			System.out.println(numero + " X " + multiplo + " = " + resultado);
			
		}
		
		System.out.println("\nLa suma de los numeros pares de " + numero + " es de " + suma);
		
		//Se hace con la formula de sucesion aritmetica pero no puedo calcular a1 si no diferencio entre par o impar , solo funciona con los pares 
		//Con los impares es lo mismo pero hay que restarles el 1
		/*
		for(int i = 1; i <= 5; i++) {
			
			n = i;
			aN = a1 + d*(n - 1);
			sumab += aN;
			
		}
		
		System.out.println("La suma de los numeros pares del " + numero + " es de " + sumab);
		
		*/
		
		sc.close();

	}
	

}
