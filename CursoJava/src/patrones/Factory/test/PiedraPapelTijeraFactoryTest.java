package patrones.Factory.test;
import patrones.Factory.*;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PiedraPapelTijeraFactoryTest {

	PiedraPapelTijeraFactory piedra;
	PiedraPapelTijeraFactory papel; 
	PiedraPapelTijeraFactory tijera;
	
	@BeforeEach
	void setUp() throws Exception {
		
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
		piedra = null;
		papel = null;
		tijera = null;
		
	}

	@Test
	public void testComparaPiedraPierdePapel() {
		
		assertEquals(-1,piedra.comparar(papel));
		assertEquals("Perdio el pedrolo oscuro contra papel" , piedra.getDescripcionResultado());
		
	}
	
	@Test
	void testGetInstancePiedra() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(0) instanceof Piedra);
	}
	
	@Test
	void testGetInstancePapel() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(1) instanceof Papel);
	}
	
	@Test
	void testGetInstanceTijera() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(2) instanceof Tijera);
	}

}
