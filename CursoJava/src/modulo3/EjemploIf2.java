package modulo3;

import java.util.Iterator;
import java.util.Scanner;

public class EjemploIf2 {

	public static void main(String[] args) {
		
		int tabla = 0;
		
		do {
			
			System.out.println("Ingresa la tabla a mostrar menor o igual a 10 y mayor que 0");
			Scanner sc = new Scanner(System.in);
			tabla = sc.nextInt();
			
		} while (tabla < 0 || tabla > 10);

		System.out.println("Tabla del " + tabla);
		for(int i = 0; i < 11 ; i++) {
			int mult = tabla*i;
			System.out.println(tabla + "x" + i + " = " + mult);
		}
	}

}
