package modulo4;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		
		int antiguedad;
		char categoria;
		float salarioBruto;
		int salarioNeto;
		
		System.out.println("Introduce antiguedad :");
		Scanner sc = new Scanner(System.in);
		antiguedad = sc.nextInt();
		
		System.out.println("Introduce la categoría a la que perteneces : ");
		String s = sc.next();
		categoria = s.charAt(0);
		
		System.out.println("Introduce tu salario bruto anual : ");
		salarioNeto = sc.nextInt();
		
		if(salarioNeto <= 12450) {
			
			salarioBruto = salarioNeto - (salarioNeto * 0.19f);
			
		}else if(salarioNeto > 12450 && salarioNeto <= 20200) {
			
			salarioBruto = salarioNeto - (salarioNeto * 0.24f);
			
		}else if(salarioNeto > 20200 && salarioNeto <= 35200) {
			
			salarioBruto = salarioNeto - (salarioNeto * 0.3f);
			
		}else if(salarioNeto > 35200 && salarioNeto <= 60000) {
			
			salarioBruto = salarioNeto - (salarioNeto * 0.37f);
			
		}else if(salarioNeto > 60000 && salarioNeto <= 300000) {
			
			salarioBruto = salarioNeto - (salarioNeto * 0.45f);
			
		}else {
			
			salarioBruto = salarioNeto - (salarioNeto * 0.47f);
		}
		
		if(antiguedad >= 1 && antiguedad <= 5) {
			
			float porcentaje = salarioBruto * 0.05f; 
			salarioBruto += porcentaje;
			
		}else if(antiguedad >= 6 && antiguedad <= 10) {
			
		    float porcentaje = salarioBruto * 0.1f; 
			salarioBruto += porcentaje;
			
		}else if(antiguedad > 10) {
			
			float porcentaje = salarioBruto * 0.3f; 
			salarioBruto += porcentaje;
			
		}else {
			
			System.out.println("No llevas un año trabajando con nosotros , necesitas mínimo un año");
			
		}
		
		if(Character.compare(categoria, 'a') == 0) {
			
			salarioBruto += 1000;
			
		}else if(Character.compare(categoria, 'b') == 0) {
			
			salarioBruto += 2000;
			
		}else if(Character.compare(categoria, 'c') == 0){
			
			salarioBruto += 3000;
			
		}else {
			
			System.out.println("Introduce una categoría adecuada");
			
		}
		
		System.out.println("Su salario Bruto anual es de " + salarioBruto);
		

	}

}
