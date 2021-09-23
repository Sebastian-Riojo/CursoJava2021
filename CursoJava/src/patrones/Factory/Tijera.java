package patrones.Factory;

public class Tijera extends PiedraPapelTijeraFactory {

	public Tijera() {
		
		nombre = "Tijera";
		numero = 2;
		
	}

	@Override
	public boolean isMe(int pNum) {
		return pNum == 2;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPpt) {
		int resultado = 0;
		
		switch (pPpt.numero) {
		case 0: 
			
			resultado = -1;
			break;
			
		case 1: 
			
			resultado = 1;
			break;
			
		case 2: 
	
			resultado = 0;
			break;
			
		default:
			break;
		}
		return resultado;
	}

}
