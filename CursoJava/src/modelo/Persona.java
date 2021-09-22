package modelo;

public class Persona {

	private String apellido;
	private String nombre; 
	
	public Persona() {
		
		nombre = "Sebastián";
		apellido = "Riojo";
		
	}
	
	public Persona(String apellido, String nombre) {
		
		this.apellido = apellido;
		this.nombre = nombre;
		
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean equals(Object obj) {
		
		boolean bln = false;
		if(obj instanceof Persona) {
			
			Persona per = (Persona) obj;
			bln = this.nombre.equals(per.getNombre()) && 
					this.apellido.equals(per.getApellido());
			
		}
		
		return bln;
	}
	
	public int hashCode(){
		return nombre.hashCode() + apellido.hashCode();
	}
	public String toString(){
		return "Nombre: " + nombre + " y Apellido: " + apellido;
	}

}
