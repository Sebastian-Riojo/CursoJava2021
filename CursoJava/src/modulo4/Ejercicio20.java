package modulo4;

import java.util.Random;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		int numero = 0;
		int maximo = 0;
		int minimo = 0;
		Random rnd = new Random();
		
		do {
			
			int numeroAzar = rnd.nextInt(100);
			System.out.println("El numero " + numero + " random es " + numeroAzar);
			
			if(numero == 0) {
				
				minimo = numeroAzar;
				
			}
			
			if(numeroAzar > maximo) {
				
				maximo = numeroAzar;
				
			}else if(numeroAzar < minimo) {
				
				minimo = numeroAzar;
				
			}
			numero++;
			
		} while (numero < 10);
		
		System.out.println("El numero mas pequeño seria el " + minimo + " y el más grande sería el " + maximo);
		
	}

}
