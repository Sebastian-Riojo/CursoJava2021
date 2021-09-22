package pruebasModelo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.com.manpower.notas.modelo.Practica;
import modelo.Alumno;
import modelo.Persona;
import modelo.Profesor;

class PersonaTest {

	Alumno alUno , alVac;
	Alumno alDos , alTres , alCuatro , alCinco;
	Profesor profe1 , profeVac;
	Profesor profe2 , profe3, profe4, profe5;
	List<Persona> listaProfesAlumnos;
	Set<Persona> setProfesAlumnos;
	Persona persona1; 
	
	@BeforeEach
	void setUp() throws Exception {
		
		  persona1 = new Persona();
		
		 alUno = new Alumno();
		 alVac = new Alumno();
		 alDos = new Alumno("Luis","Alonso",123456);
		 alTres = new Alumno("Sebas" , "Riojo" , 124567);
		 alCuatro = new Alumno("Alfonso" , "Miguelañez" , 562384);
		 alCinco = new Alumno("Jose" , "Clavijo" , 9658475);
		 
		 profe1 = new Profesor();
		 profeVac = new Profesor();
		 profe2 = new Profesor("Alonso","Martinez","2342123");
		 profe3 = new Profesor("Angel","Caño","5849671");
		 profe4 = new Profesor("Yolanda","Diaz","8745852");
		 profe5 = new Profesor("Isabel","Vázquez","96854875");
		
	    listaProfesAlumnos = new ArrayList<Persona>();
	    setProfesAlumnos = new HashSet<Persona>();
		
		listaProfesAlumnos.add(alUno);
		listaProfesAlumnos.add(alDos);
		listaProfesAlumnos.add(profe1);
		listaProfesAlumnos.add(profe2);
		listaProfesAlumnos.add(alTres);
		listaProfesAlumnos.add(profe3);
		
		setProfesAlumnos.add(alVac);
		setProfesAlumnos.add(profeVac);
		setProfesAlumnos.add(alCuatro);
		setProfesAlumnos.add(profe4);
		setProfesAlumnos.add(alCinco);
		setProfesAlumnos.add(profe5);
		
		
	}

	@After
	void tearDown() throws Exception {
		
		listaProfesAlumnos = null;
		setProfesAlumnos = null;
		
		persona1 = null;
		
		alUno = null;
		alDos = null; 
		alTres = null;
		alCuatro = null;
		alCinco = null;
		alVac = null;
		
		profe1 = null;
		profe2 = null;
		profe3 = null;
		profe4 = null;
		profe5 = null;
		profeVac = null;
		
		
	}
	
	@Test
	void testListaEqualsContainsTRUE() {
		
		Alumno alu = new Alumno();
		Profesor prof = new Profesor("Alonso","Martinez","2342123");
		assertTrue(listaProfesAlumnos.contains(alu));
		assertTrue(listaProfesAlumnos.contains(prof));
		
	}
	
	@Test
	void testListaEqualsContainsFALSE() {
		
		Alumno alu = new Alumno("Pablo", "Ramirez" , 9172381);
		Profesor prof = new Profesor("Jesus" , "Calleja","5145118");
		assertFalse(listaProfesAlumnos.contains(alu));
		assertFalse(listaProfesAlumnos.contains(prof));
		
	}
	
	@Test
	public void testListaAdd(){		
		Alumno alu = new Alumno("Jose", "Miguel" , 98676565);		
		Profesor profe = new Profesor();
		assertTrue(listaProfesAlumnos.add(alu));
		assertTrue(listaProfesAlumnos.add(profe));
		System.out.println("listaProfesAlumnos : \n" + listaProfesAlumnos);
	}
	
	@Test
	void testSetEqualsContainsTRUE() {
		
		Alumno alu =new Alumno("Jose" , "Clavijo" , 9658475);
		Profesor prof = new Profesor();
		assertTrue(setProfesAlumnos.contains(alu));
		assertTrue(setProfesAlumnos.contains(prof));
		
	}
	
	@Test
	void testSetEqualsContainsFALSE() {
		
		Alumno alu = new Alumno("Lucia" , "Pinta", 1293838);
		Profesor prof = new Profesor("Alonso","Martinez","2342123");
		assertFalse(setProfesAlumnos.contains(alu));
		assertFalse(setProfesAlumnos.contains(prof));
		
	}
	
	@Test
	public void testSetAdd(){
		Alumno alu = new Alumno("Jose", "Miguel" , 98676565);		
		Profesor profe2 = new Profesor("Alonso","Martinez","2342123");
		assertTrue(setProfesAlumnos.add(alu));
		assertTrue(setProfesAlumnos.add(profe2));
		System.out.println("setProfesAlumnos : \n" + listaProfesAlumnos);
		
	}
	
	@Test
	public void testPersona() {
		//pruebo el contrtructor vacio
		assertEquals("Sebastián", alUno.getNombre());
		assertEquals("Riojo", alUno.getApellido());
		
	}
	
	@Test
	public void testPersonaStringString() {
		//pruebo el contrtructor vacio
		assertEquals("Alfonso", alCuatro.getApellido());
		assertEquals("Miguelañez", alCuatro.getNombre());
		
	}
	
	@Test
	public void testAlumno() {
		//pruebo el contrtructor vacio
		assertEquals("Sebastián", alUno.getNombre());
		assertEquals("Riojo", alUno.getApellido());
		assertEquals(3456, alUno.getNumeroExpediente());
		
	}
	
	@Test
	public void testAlumnoStringStringInt() {
		//pruebo el contrtructor vacio
		assertEquals("Luis", alDos.getApellido());
		assertEquals("Alonso", alDos.getNombre());
		assertEquals(123456, alDos.getNumeroExpediente());
		
	}
	
	@Test
	void testProfesor() {
		
		assertEquals("Riojo", profeVac.getApellido());
		assertEquals("Sebastián", profeVac.getNombre());
		assertEquals("2345678", profeVac.getIosfa());
		
	}
	
	@Test
	void testProfesorStringStringString() {
		assertEquals("Martinez", profe2.getApellido());
		assertEquals("Alonso", profe2.getNombre());
		assertEquals("2342123", profe2.getIosfa());
		
	}
	
	@Test
	public void testEqualsProfesorTRUE(){
		Profesor profe = new Profesor();
		assertTrue(profeVac.equals(profe));
	}
	
	@Test
	public void testEqualsProfesorFalse(){
		Alumno alu = new Alumno();
		assertFalse(profeVac.equals(alu));
	}
	
	@Test
	public void testEqualsAlumnoTRUE(){
		Alumno alu = new Alumno();
		assertTrue(alVac.equals(alu));
	}
	
	@Test
	public void testEqualsAlumnoFalse(){
		Profesor profe = new Profesor();
		assertFalse(alVac.equals(profe));
	}
	
	@Test
	public void testEqualsPersonaTRUE(){
		Persona per = new Persona();
		assertTrue(persona1.equals(per));
	}
	
	@Test
	public void testEqualsPersonaFalse(){
		Practica practica = new Practica();
		assertFalse(persona1.equals(practica));
	}

}
