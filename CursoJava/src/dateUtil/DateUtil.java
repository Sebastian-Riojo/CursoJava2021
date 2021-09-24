package dateUtil;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	static Calendar cal; 
	static Date fecha;
	static String fechaMod;
	static SimpleDateFormat formato;
	
	public static void main(String[] args) {
		
			cal = Calendar.getInstance();
			cal.set(2000, Calendar.OCTOBER,9);
			fecha = cal.getTime();
			formato = (SimpleDateFormat)DateFormat.getDateInstance(DateFormat.MEDIUM);
			fechaMod = formato.format(fecha);
			System.out.println("La fecha elegida es " + fecha + "\n");
			
			System.out.println("El año de la fecha introducida es el: " + getAnio(fecha) + "\n");
			System.out.println("El Mes de la fecha introducida es " + getMes(fecha) + "\n");
			System.out.println("El Día de la fecha introducida es " + getDia(fecha) + "\n");
			
			if(isOrNotFinDeSemana(fecha)) {
				
				System.out.println("La fecha que se introdujo cae en fin de semana \n");
				
			}else {
				
				System.out.println("La fecha que se introdujo no cae en fin de semana \n");
				
			}
			
			//System.out.println(String.valueOf(DateFormat.MEDIUM));
			String pattern = "yyyy-MM-dd";

			System.out.println("El Dia de la semana es " + getDiaDeSemana(fecha) + "\n");
			System.out.println("El metodo asDate devuelve: " + asData("yyyy-MM-dd", "2000-10-09") + "\n");
			Calendar cal = asCalendar("yyyy-MM-dd", "2000-10-09");
			String fecha1Cal = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.YEAR);
			System.out.println("El metodo asCalendar devueolve: " + fecha1Cal + "\n");
			System.out.println("El metodo asDate devuelve: " + asString("dd/MM/yyyy", fecha));
	}

	public static int getAnio(Date fecha) {
		
		cal.setTime(fecha);
		return cal.get(Calendar.YEAR);
		
	}
	
	public static int getMes(Date fecha) {
		
		cal.setTime(fecha);
		return cal.get(Calendar.MONTH) + 1;
		
	}
	
	public static int getDia(Date fecha) {
		
		cal.setTime(fecha);
		return cal.get(Calendar.DAY_OF_MONTH);
		
	}
	
	public static boolean isOrNotFinDeSemana(Date fecha) {
		
		cal.setTime(fecha);
		if((cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)||
				cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
					
					return true;
			
				}else {
					
					return false;
					
				}
		
	}
	
	public static int getDiaDeSemana(Date fecha) {
		
		cal.setTime(fecha);
		return cal.get(Calendar.DAY_OF_WEEK);
		
	}
	
	public static Date asData(String Pattern , String Fecha) {
		
		 SimpleDateFormat formato = new SimpleDateFormat(Pattern);
		 Date fechaDate = null;
		
		 	try {
	            fechaDate = formato.parse(Fecha);
	        } 
	        catch (Exception ex) 
	        {
	            System.out.println(ex);
	        }
		 	
		 	return fechaDate;
		
	}
	
	public static Calendar asCalendar(String Pattern , String Fecha) {
		
		 SimpleDateFormat formato = new SimpleDateFormat(Pattern);
		 Date fechaDate = null;
		
		 	try {
	            fechaDate = formato.parse(Fecha);
	            Calendar cal = Calendar.getInstance();
	            cal.setTime(fechaDate);
	        } 
	        catch (Exception ex) 
	        {
	            System.out.println(ex);
	        }
		 	
		 	return cal;
		
	}
	
	public static String asString(String Pattern , Date Fecha) {
		
		 SimpleDateFormat formato = new SimpleDateFormat(Pattern);
		 String fechaRec = "";
		 
		 	try {
	            fechaRec = formato.format(Fecha);
	        } 
	        catch (Exception ex) 
	        {
	            System.out.println(ex);
	        }
		 	
		 	return fechaRec;
		
	}
	
	
	
}
