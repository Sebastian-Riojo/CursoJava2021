package modelo;

public class Tri�ngulo extends Figura{

	private float base, cateto1 , cateto2 , altura;

	public Tri�ngulo() {
		super();
		base = 0;
		cateto1 = 0;
		cateto2 = 0;
		altura = 0;
	}

	public Tri�ngulo(String nombre , float base , float cateto1 , float cateto2 , float altura) {
		super(nombre);
		this.base = base;
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
		this.altura = altura;
		
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getCateto1() {
		return cateto1;
	}

	public void setCateto1(float cateto1) {
		this.cateto1 = cateto1;
	}

	public float getCateto2() {
		return cateto2;
	}

	public void setCateto2(float cateto2) {
		this.cateto2 = cateto2;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public float calcularPer�metro() {

		float resultado = base + cateto1 + cateto2;
		
		return resultado;
	}

	@Override
	public float calcularSuperficie() {
		
		float resultado = (base * altura)/2f;
		
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
		resultado.append(" , de cateto1: ");
		resultado.append(this.cateto1);
		resultado.append(" , de cateto2: ");
		resultado.append(this.cateto2);
		resultado.append(" , de �rea : ");
		resultado.append(calcularSuperficie());
		resultado.append(" y de per�metro: ");
		resultado.append(calcularPer�metro());
		
		String valor = resultado.toString();
		return valor;
	}
	
	public String toString() {
		
		return super.toString() + getValores() + "\n";
		
	}
	
	public int hashCode() {
		
		return (int) (getNombre().hashCode() + getMaximaSuperficie() + calcularPer�metro());
		
	}
	
	public boolean equals(Object odb) {
		
		return odb instanceof Tri�ngulo 
				&& super.equals(odb)
				&&getNombre() == ((Tri�ngulo)odb).getNombre()
				&&getBase() == ((Tri�ngulo)odb).getBase()
				&&getAltura() == ((Tri�ngulo)odb).getAltura();
		
	}

}
