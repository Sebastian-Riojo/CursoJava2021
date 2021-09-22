package modelo;

public abstract class Figura {

	//El testeo de figura y las demas estan en modelos test y es el de Figura test
	
	private static float maximaSuperficie;
	private String nombre;
	
	public Figura() {
		
		nombre = "Figura";
		maximaSuperficie = 0;
		
	}
	
	public Figura(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public static float getMaximaSuperficie() {
		return maximaSuperficie;
	}
	
	public static void setMaximaSuperficie(float maximaSuperficie) {
		Figura.maximaSuperficie = maximaSuperficie;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract float calcularPerímetro();
	public abstract float calcularSuperficie();
	public abstract String getValores();
	
	public int hashCode() {
		
		return (int) (nombre.hashCode() + maximaSuperficie);
		
	}
	
    public boolean equals(Object obj) {
		
		return obj instanceof Figura
				&&getNombre() == ((Figura)obj).getNombre();
		
	}
    
    public String toString() {
    	
    	return "Nombre : " + nombre;
    	
    }
	
}
