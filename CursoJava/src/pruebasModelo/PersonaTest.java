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

import modelo.Alumno;
import modelo.Persona;
import modelo.Profesor;

class PersonaTest {

	Alumno alUno;
	Alumno alDos;
	Profesor profe1;
	Profesor profe2;
	Persona personaUno;
	Persona personaDos;
	
	@BeforeEach
	void setUp() throws Exception {
		
		 alUno = new Alumno();
		 alDos = new Alumno("Luis","Alonso",123456);
		 profe1 = new Profesor();
		 profe2 = new Profesor("Alonso","Martinez","2342123");
		 personaUno = new Persona();
		 personaDos = new Persona("Pablo" , "Motos");
		
		List<Persona> profesAL = new ArrayList<Persona>();
		Set<Persona> profesAl = new HashSet<Persona>();
		
		profesAL.add(alUno);
		profesAL.add(alDos);
		profesAL.add(profe1);
		profesAL.add(profe2);
		
		profesAl.add(alUno);
		profesAl.add(alDos);
		profesAl.add(profe1);
		profesAl.add(profe2);
		
		
	}

	@After
	void tearDown() throws Exception {
		alUno = null;
		
		
	}

	@Test
	void testPersona() {
		fail("Not yet implemented");
	}

	@Test
	void testPersonaStringString() {
		fail("Not yet implemented");
	}

	@Test
	void testEqualsObject() {
		fail("Not yet implemented");
	}
	
	@Test
	void testAlumno() {
		fail("Not yet implemented");
	}
	
	@Test
	void testAlumnoStringStringInt() {
		fail("Not yet implemented");
	}
	
	@Test
	void equalsAlumno() {
		fail("Not yet implemented");
	}
	
	@Test
	void testProfesor() {
		fail("Not yet implemented");
	}
	
	@Test
	void testProfesorStringStringString() {
		fail("Not yet implemented");
	}
	
	@Test
	void equalsProfesor() {
		fail("Not yet implemented");
	}

}
