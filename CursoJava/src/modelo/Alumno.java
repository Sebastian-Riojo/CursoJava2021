package modelo;

public class Alumno extends Persona{

	private int numeroExpediente;

	public Alumno() {
		super();
		this.numeroExpediente = 3456;
	}
	
	public Alumno(String nombre, String apellido , int numExpediente) {
		super(nombre , apellido);
		this.numeroExpediente = numExpediente;
	}

	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}
	
	public boolean equals(Object obj) {
		
		return obj instanceof Alumno
				&& super.equals(obj)
				&&getNombre() == ((Alumno)obj).getNombre();
		
	}
	
	public int hashCode() {
		
		return numeroExpediente + 1;
		
	}
	
	public String toString() {
		
		return super.toString() + " y numero de expediente: " + numeroExpediente + "\n";
		
	}
}
