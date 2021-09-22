package es.com.manpower.notas.modelo;

import java.util.List;

public class Alumno implements Model{

	private int codigo;
	private String nombre , apellido , estudios , git;
	private List<PracticaResuelta> practicasResueltas;
	
	public Alumno() {
		
		
		
	}
	
	public Alumno(int codigo, String nombre, String apellido, String estudios, String git) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estudios = estudios;
		this.git = git;
	}

	
	
	public Alumno(int int1) {
		this.codigo = int1;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public String getGit() {
		return git;
	}

	public void setGit(String git) {
		this.git = git;
	}

	public List<PracticaResuelta> getPracticasResueltas() {
		return practicasResueltas;
	}

	public void setPracticasResueltas(List<PracticaResuelta> practicasResueltas) {
		this.practicasResueltas = practicasResueltas;
	}
	
	public boolean equals(Object odb) {
		
		return odb instanceof Alumno 					 	&&
				((Alumno)odb).getNombre().equals(nombre)    &&
				((Alumno)odb).getApellido().equals(apellido);
		
	}
	
	public int hashCode() {
		
		return nombre.hashCode() + apellido.hashCode();
		
	}
	
	public String toString() {
		
		StringBuilder sb= new StringBuilder("codigo = ");
		sb.append(this.codigo);
		sb.append(" , nombre = ");
		sb.append(this.nombre);
		sb.append(" , apellido = ");
		sb.append(this.apellido);
		sb.append(" , estudios = ");
		sb.append(this.estudios);
		sb.append(" , link de git = ");
		sb.append(this.git);
		sb.append(" y prácticas resueltas = ");
		sb.append(this.practicasResueltas);
		
		return sb.toString();
		
		
	}

	public static void main(String[] args) {
		

	}

}
