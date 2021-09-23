package stringUtil;

public class StringUtil {

	static String str;
	static char primero;
	
	public static void main(String[] args) {
		
	    str = "Hola123 3456";
	    
	    System.out.println("El String que estamos usando es " + str + " y primero vemos si contiene o no"
	    		+ " doble espacio \n");
	    
	    if(containsDobleSpace() == true) {
	    	
	    	System.out.println("El String contiene un doble espacio \n");
	    	
	    }else {
	    	
	    	System.out.println("El String no contiene un doble espacio \n");
	    	
	    }
	    
	    System.out.println("Y ahora veremos si el String contiene un número: \n");
	    
	    if(containsNumber(str)) {
	    	
	    	System.out.println("El String contiene números");
	    	
	    }else {
	    	
	    	System.out.println("El String no contiene un número");
	    	
	    }
		
	}
	
	public static boolean containsDobleSpace() {
		
	    int longitud = str.length();
	    for(int i = 0; i < longitud; i++) {
	    		
		    	if(str.charAt(i) == ' ' && str.charAt(i) == primero){
		    		
	    			i = longitud;
	    			return true;
	    			
	    		}
	    	     
	    		if(str.charAt(i) == ' ') {
		    		
	    			primero = str.charAt(i);
		    		
		    	}
	    		
	    	}
	    	
	    
	    return false;
		
	}
	
	public static boolean containsNumber(String cadena) {
		
		int longitud = cadena.length();
		
		for(int i = 0; i < longitud; i++) {
			
			char c = cadena.charAt(i);
	        if (!(c >= 'a' && c <= 'z')) {
	            
	        	i = longitud;
	        	return true;
	        }
			
		}
		
		return false;
		
	}
	
}
