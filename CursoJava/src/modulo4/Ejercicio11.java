package modulo4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		//Intente hacerlo con char pero es tan simple la variable que no puedo comparar por lo que se guarda en la variable y despues la casteo a string
		
		String caracterEs,caracterCon;
		char caracter; 
		System.out.println("Introduce el caracter para ver si es vocal o no: ");
		Scanner sc = new Scanner(System.in);
		caracterEs = sc.next();
		caracter = caracterEs.charAt(0);
		caracterCon = String.valueOf(caracter);
		
		if(caracterEs.length() == 1) {
			
			if(caracterCon.compareTo("a") == 0||caracterCon.compareTo("e") == 0||caracterCon.compareTo("i") == 0||caracterCon.compareTo("o") == 0
					||caracterCon.compareTo("u") == 0) {
				
				System.out.println("La letra introducida es una vocal ya que es " + caracterCon);
				
			}else {
				
				System.out.println("La letra introducida no es una vocal o no pertenece al abecedario español , la letra es " + caracterCon);
				
			}
			
		}else {
			
			System.out.println("Introduce solo una letra");
			
		}
		sc.close();

	}

}
