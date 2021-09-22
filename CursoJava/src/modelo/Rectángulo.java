package modelo;

public class Rectángulo extends Figura{

	private float altura; 
	private float base;
	
	public Rectángulo() {
		super();
		altura = 0;
		base = 0;
	}

	public Rectángulo(String nombre,float altura,float base) {
		super(nombre);
		this.altura = altura;
		this.base = base;
	}
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	@Override
	public float calcularPerímetro() {
		
		float resultado = altura * 2 + base * 2;
		
		return resultado;
	}

	@Override
	public float calcularSuperficie() {
		
		float resultado = base * altura;
		
		if(resultado > Figura.getMaximaSuperficie()) {
			
			Figura.setMaximaSuperficie(resultado);
			
		}
				
		return resultado;
	}

	@Override
	public String getValores() {
		
		StringBuilder resultado = new StringBuilder(" y con valores de base: ");
		resultado.append(this.base);
		resultado.append(" , de altura: ");
		resultado.append(this.altura);
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
		
		return odb instanceof Rectángulo 
				&& super.equals(odb)
				&&getNombre() == ((Rectángulo)odb).getNombre()
				&&getBase() == ((Rectángulo)odb).getBase()
				&&getAltura() == ((Rectángulo)odb).getAltura();
		
	}

	
	
}
