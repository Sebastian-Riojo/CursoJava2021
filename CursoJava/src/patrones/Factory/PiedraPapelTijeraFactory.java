package patrones.Factory;

import java.util.ArrayList;
import java.util.List;

public abstract class PiedraPapelTijeraFactory {

	private static List<PiedraPapelTijeraFactory> elementos;
	protected String nombre;
	protected int numero;
	protected String descripcionResultado;
	
	public PiedraPapelTijeraFactory() {
		
	}

	
	
	public String getDescripcionResultado() {
		return descripcionResultado;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public static PiedraPapelTijeraFactory getInstance(int pNum) {
		
		elementos = new ArrayList<PiedraPapelTijeraFactory>();
		elementos.add(new Piedra());
		elementos.add(new Papel());
		elementos.add(new Tijera());
		
		for(PiedraPapelTijeraFactory piedraPapelTijeraFactory : elementos) {
			
			if(piedraPapelTijeraFactory.isMe(pNum))
			return piedraPapelTijeraFactory;
			
		}
		return null;
		
	}
	
	public abstract boolean isMe(int pNum);
	public abstract int comparar(PiedraPapelTijeraFactory pPpt);
	

}
