package modelo;

public class Profesor extends Persona{

	String iosfa;
	
	public Profesor(String iosfa , String nombre , String apellido) {
		super(iosfa,nombre);
		this.iosfa = iosfa;
	}

    public Profesor() {
    	
    	super();
    	this.iosfa = "2345678";
    	
    }

	public String getIosfa() {
		return iosfa;
	}

	public void setIosfa(String iosfa) {
		this.iosfa = iosfa;
	}
	
	public int hashCode() {
		
		return iosfa.hashCode();
		
	}
	
	public boolean equals(Object obj) {
		
		return obj instanceof Profesor 					&&
				super.equals(obj)  							&&
				getNombre() == ((Persona)obj).getNombre();
		
	}
	
	public String toString() {
		return super.toString() + " y iosfa: " + iosfa;
	}

}
