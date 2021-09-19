package modulo4;

import java.util.Random;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		int numero = 0;
		Random rnd = new Random();
		int suma = 0;
		int num = 0;
		
		while(numero < 10) {
			
			int numeroAzar = rnd.nextInt(100);
			System.out.println("El numero " + numero + " random es " + numeroAzar);
			num = numeroAzar;
			suma += num;
			numero++;
		}
		
		float promedio = suma/10f;
		System.out.println("La suma de los numeros random es de " + suma);
		System.out.println("\nEl promedio de los diez numeros ranfom es de " + promedio);
		

	}

}
