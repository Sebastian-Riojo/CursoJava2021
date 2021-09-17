package Objetos;

public class Cuenta {

	private int numero;
	private float saldo;

	public Cuenta() {
		numero = 10;
		saldo = 1000f;
	}
	
	public Cuenta(int numero , float saldo) {
		
		this.numero = numero;
		this.saldo = saldo;
		
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void acreditar(float pMonto) {
		
		saldo += pMonto;
		
	}
	
	public void debitar(float pMonto) {
		
		saldo -= pMonto;
		
	}
}
