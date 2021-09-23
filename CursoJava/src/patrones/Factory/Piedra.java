package patrones.Factory;

public class Piedra extends PiedraPapelTijeraFactory{

	public Piedra() {
		
		numero = 0;
		nombre = "Piedra";
		
	}
	
	@Override
	public boolean isMe(int pNum) {
		return pNum == 0;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPpt) {
		
		int resultado = 0;
		
		switch (pPpt.numero) {
		case 0: 
			
			resultado = 0;
			descripcionResultado = "Empatamos seguimos siendo amigos";
			break;
			
		case 1: 
			
			resultado = -1;
			descripcionResultado = "Perdio el pedrolo oscuro contra " + pPpt.getNombre();
			break;
			
		case 2: 
	
			resultado = 1;
			descripcionResultado = "Ganó el pedrolo oscuro contra " + pPpt.getNombre();
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + pPpt.getNumero());
		}
		return resultado;
	}

}
