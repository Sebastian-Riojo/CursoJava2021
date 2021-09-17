package Objetos;

public class CuentaTest {

	public static void main(String[] args) {

		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta(20,2000);
		
		System.out.println("Se creo la cuenta 1 con saldo " + c1.getSaldo() + " y con numero  " + c1.getNumero());
		System.out.println("Se creo la cuenta 2 con saldo " + c2.getSaldo() + " y con numero  " + c2.getNumero());
		
		System.out.println("Le voy a acreditar 100 a c1");
		c1.acreditar(100);
		System.out.println("El nuevo saldo de c1 es " + c1.getSaldo());
	
		System.out.println("\nLe voy a debitar 80");
		c1.debitar(80);
		System.out.println("El nuevo debito de c1 es " + c1.getSaldo());
	}
	
}
