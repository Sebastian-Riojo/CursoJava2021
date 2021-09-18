package modulo4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//No me di cuenta y hice el 3 y el 13 juntos , ya que el case se cambia por if else y viceversa , en este caso lo decidi hacer con case en cambio 
		//el cinco esta hecho con if else en ved de con un switch 
		
		String mes;
		
		System.out.println("Introduce el nombre del mes: ");
		Scanner sc = new Scanner(System.in);
		mes = sc.next();
		
		switch (mes) {
		case "Enero":
		case "enero":
			
			System.out.println(mes + " tiene 31 dias");
		
			break;
		case "Febrero":
		case "febrero":
			
			System.out.println(mes + " tiene 28 dias");
			
			break;
		case "Marzo":
		case "marzo":
			
			System.out.println(mes + " tiene 31 dias");
			
			break;
		case "Abril":
		case "abril":
			
			System.out.println(mes + " tiene 30 dias");
			
			break;
		case "Mayo":
		case "mayo":
			
			System.out.println(mes + " tiene 31 dias");
			
			break;
		case "Junio":
		case "junio":
			
			System.out.println(mes + " tiene 30 dias");
			
			break;
		case "Julio":
		case "julio":
			
			System.out.println(mes + " tiene 31 dias");
			
			break;
		case "Agosto":
		case "agosto":
			
			System.out.println(mes + " tiene 31 dias");
			
			break;
		case "Septiembre":
		case "septiembre":
			
			System.out.println(mes + " tiene 30 dias");
			
			break;
		case "Octubre":
		case "octubre":
			
			System.out.println(mes + " tiene 31 dias");
			
			break;
		case "Noviembre":
		case "noviembre":
			
			System.out.println(mes + " tiene 30 dias");
			
			break;
		case "Diciembre":
		case "diciembre":
			
			System.out.println(mes + " tiene 31 dias");
			
			break;
			
		default:
			throw new IllegalArgumentException("El mes debe ser un mes o si no escribelo con Mayuscula o mínuscula la primera letra(no valen numeros)");
		}
		
		sc.close();
		
	}

}
