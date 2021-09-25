package es.com.manpower.notas.modelo;

public class Practica implements Model{

	private int practicaID;
	private String practicaNombre;
	
	public Practica() {
		
		practicaID = 0;
		practicaNombre = "";
		
	}
	
	
	public Practica(int practicaID, String practicaNombre) {
		super();
		this.practicaID = practicaID;
		this.practicaNombre = practicaNombre;
	}
	
	public Practica(int int1) {
		super();
		this.practicaID = int1;
		
	}


	public int getPracticaID() {
		return practicaID;
	}
	public void setPracticaID(int practicaID) {
		this.practicaID = practicaID;
	}
	public String getPracticaNombre() {
		return practicaNombre;
	}
	public void setPracticaNombre(String practicaNombre) {
		this.practicaNombre = practicaNombre;
	}
	
	public boolean equals(Object obj) {
		
		return obj instanceof Practica &&
				((Practica)obj).getPracticaID() == practicaID;
		
	}
	
	public int hashCode() {
		
		return practicaNombre.hashCode() + practicaID;
		
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder("El id de la práctica es ");
		sb.append(practicaID);
		sb.append(" y el nombre de la práctica es ");
		sb.append(practicaNombre);
		
		return sb.toString();
		
	}
	
	
	
}
