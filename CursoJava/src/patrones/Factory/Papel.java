package patrones.Factory;

public class Papel extends PiedraPapelTijeraFactory {

	public Papel() {
		nombre = "papel";
		numero = 1;
	}
	
	@Override
	public boolean isMe(int pNum) {
		return pNum == 1;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPpt) {

int resultado = 0;
		
		switch (pPpt.numero) {
		case 0: 
			
			resultado = 1;
			break;
			
		case 1: 
			
			resultado = 0;
			break;
			
		case 2: 
	
			resultado = -1;
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + pPpt.getNumero());
		}
		return resultado;
		
	}

}
