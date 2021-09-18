package modulo4;

import java.util.Random;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Ya utilice la sentencia and junto con la or para resolver el ejercicio , si solo se hiciera con and quedaría mucho más largo y sería partiendo los or en if else
		
		System.out.println("Las normas son que 0 vale \"piedra\" , 1 vale \"papel\" y 2 vale \"tijera\"");
		Random r = new Random();
		int num1 = r.nextInt(3);
		int num2 = r.nextInt(3);
		System.out.println("El primer competidor saca: " + num1);
		System.out.println("El segundo competidor saca: " + num2);
		
		if((num1 == 0 && num2 == 2)|| (num1 == 2 && num2 == 0)) {
			
			if(num1 == 0) {
				
				System.out.println("Gana el jugador uno");
				
			}else {
				
				System.out.println("Gana el jugador dos");
				
			}
			
		}else if((num1 == 1 && num2 == 2)||(num1 == 2 && num2 == 1)) {
			
			if(num1 == 1) {
				
				System.out.println("Gana el jugador dos");
				
			}else {
				
				System.out.println("Gana el jugador uno");
				
			}
			
		}else {
			
			if(num1 == 2) {
				
				System.out.println("Gana el jugador dos");
				
			}else {
				
				System.out.println("Gana el jugador uno");
				
			}
			
		}
		
		
		
	}

}
