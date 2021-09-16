package modulo3;

import java.util.Scanner;

public class EjemploIfJava {

	public static void main(String[] args) {
		System.out.println("ingresa primer nota: ");
		Scanner sc = new Scanner(System.in);
		float nota = sc.nextFloat();
		
		System.out.println("ingresa segunda nota: ");
		float nota2 = sc.nextFloat();
		
		System.out.println("ingresa tercera nota: ");
		float nota3 = sc.nextFloat();
		
		float promedio = (nota + nota2 + nota3)/3f;
		
		if(promedio >= 5) System.out.println("Aprobaste");
		else System.out.println("No aprobaste");
		
		System.out.println("El promedio es " + promedio);
	}

}
