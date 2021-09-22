package modelo;

public class Circulo extends Figura{

	private float radio;
	
	public Circulo() {
		super();
		radio = 0;
	}
	
	public Circulo(String nombre , float radio) {
		super(nombre);
		this.radio = radio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override
	public float calcularPerímetro() {
		
		float resultado = 2 * (float)Math.PI * radio;
		
		return resultado;
	}

	@Override
	public float calcularSuperficie() {
		
		float resultado = (float)Math.PI * radio * radio;
		
		if(resultado > Figura.getMaximaSuperficie()) {
			
			Figura.setMaximaSuperficie(resultado);
			
		}
		
		return resultado;
	}

	@Override
	public String getValores() {

		StringBuilder resultado = new StringBuilder(" y con valores de radio: ");
		resultado.append(this.radio);
		resultado.append(" , de área : ");
		resultado.append(calcularSuperficie());
		resultado.append(" y de perìmetro: ");
		resultado.append(calcularPerímetro());
		
		String valor = resultado.toString();
		
		return valor;
	}
	
    public int hashCode() {
		
		return (int) (getNombre().hashCode() + getMaximaSuperficie() + calcularPerímetro());
		
	}
	
    public boolean equals(Object obj) {
		
		return obj instanceof Circulo
				&&super.equals(obj)
				&&getNombre() == ((Circulo)obj).getNombre()
				&&getRadio() == ((Circulo)obj).getRadio();
		
	}
    
    public String toString() {
    	
    	return super.toString() + getValores() + "\n";
    	
    }

}
