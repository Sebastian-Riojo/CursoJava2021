package modelo;

public class Cuadrado extends Figura{

	private float lado;
	
	public Cuadrado() {
		super();
		lado = 0;
	}

	public Cuadrado(String nombre , float lado) {
		super(nombre);
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public float calcularPerímetro() {
		
		float resultado = lado * 4;
		
		return resultado;
	}

	@Override
	public float calcularSuperficie() {
		
		float resultado = lado * lado;
		
		if(resultado > Figura.getMaximaSuperficie()) {
			
			Figura.setMaximaSuperficie(resultado);
			
		}
		
		return resultado;
	}

	@Override
	public String getValores() {
		
		StringBuilder resultado = new StringBuilder(" y con valores de lado: ");
		resultado.append(this.lado);
		resultado.append(" , de área : ");
		resultado.append(calcularSuperficie());
		resultado.append(" y de perìmetro: ");
		resultado.append(calcularPerímetro());
		
		String valor = resultado.toString();
		
		return valor;
	}
	
	public String toString() {
		
		return super.toString() + getValores() + "\n";
		
	}
	
	public int hashCode() {
		
		return (int) (getNombre().hashCode() + getMaximaSuperficie() + calcularPerímetro());
		
	}
	
	public boolean equals(Object odb) {
		
		return odb instanceof Cuadrado 
				&& super.equals(odb)
				&&getNombre() == ((Cuadrado)odb).getNombre()
				&&getLado() == ((Cuadrado)odb).getLado();
		
	}

}
