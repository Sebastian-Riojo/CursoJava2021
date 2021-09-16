package modulo2;

public class Mod2_Ejercicio2 {

	public static void main(String[] args) {
		
		//Para calcular el maximo es siempre (2^(n-1))-1 siendo n el número de bits 
		//y para el mínimo sería (2^(n-1))*-1
		
		byte bMin = -128;
		byte bMax = 127;
		short sMax = 32767;
		short sMin = -32768;
		int iMax = 2147483647;
		int iMin = -2147483648;
		long lMax = 9223372036854775807l;
		long lMin = -9223372036854775808l;
		
		System.out.println("tipo\tminimo\t\t\tmaximo");
		System.out.println("....\t......\t\t\t......");
		System.out.println("\nbyte\t" + bMin + "\t\t\t" + bMax);
		System.out.println("\nbyte\t" + sMin + "\t\t\t" + sMax);
		System.out.println("\nbyte\t" + iMin + "\t\t" + iMax);
		System.out.println("\nbyte\t" + lMin + "\t" + lMax);
	}

}
