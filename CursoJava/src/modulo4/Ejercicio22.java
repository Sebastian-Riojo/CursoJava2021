package modulo4;

public class Ejercicio22 {

	static int antiguedad;
	static float salarioBruto;
	static int salarioNeto;
	
    char[] categorias;
	
	public static void main(String[] args) {
		
		char[] categorias = {'a','b','c'};
		
		for(int i = 0; i < 10; i++) {
			
			antiguedad = (int) (Math.random()*(99-0) + 1);
			System.out.println(antiguedad);
			char catog = categorias[(int) (Math.random()*(2-0))];
			System.out.println(catog);
			salarioBruto = (float) (Math.random()*(2000000-15000));
			System.out.println(salarioBruto);
			
			if(salarioBruto <= 12450) {
				
				salarioNeto = (int) (salarioBruto - (salarioBruto * 0.19f));
				
			}else if(salarioBruto > 12450 && salarioBruto <= 20200) {
				
				salarioNeto = (int) (salarioBruto - (salarioBruto * 0.24f));
				
			}else if(salarioBruto > 20200 && salarioBruto <= 35200) {
				
				salarioNeto = (int) (salarioBruto - (salarioBruto * 0.3f));
				
			}else if(salarioBruto > 35200 && salarioBruto <= 60000) {
				
				salarioNeto = (int) (salarioBruto - (salarioBruto * 0.37f));
				
			}else if(salarioBruto > 60000 && salarioBruto <= 300000) {
				
				salarioNeto = (int) (salarioBruto - (salarioBruto * 0.45f));
				
			}else {
				
				salarioNeto = (int) (salarioBruto - (salarioBruto * 0.47f));
			}
			
			if(antiguedad >= 1 && antiguedad <= 5) {
				
				float porcentaje = salarioNeto * 0.05f; 
				salarioNeto += porcentaje;
				
			}else if(antiguedad >= 6 && antiguedad <= 10) {
				
			    float porcentaje = salarioNeto * 0.1f; 
			    salarioNeto += porcentaje;
				
			}else if(antiguedad > 10) {
				
				float porcentaje = salarioNeto * 0.3f; 
				salarioNeto += porcentaje;
				
			}else {
				
				System.out.println("No llevas un año trabajando con nosotros , necesitas mínimo un año");
				
			}
			
			if(Character.compare(catog, 'a') == 0) {
				
				salarioNeto += 1000;
				
			}else if(Character.compare(catog, 'b') == 0) {
				
				salarioNeto += 2000;
				
			}else if(Character.compare(catog, 'c') == 0){
				
				salarioNeto += 3000;
				
			}else {
				
				System.out.println("Introduce una categoría adecuada");
				
			}
			
			System.out.println("Su salario Neto anual es de " + salarioNeto);
			
			
		}

	}

}
