package objetosTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Objetos.Cuenta;

class CuentaTest2 {

	Cuenta cuentaVacio;
	Cuenta cuentaLLeno;
	
	@BeforeEach
	void setUp() throws Exception {
		
		cuentaVacio = new Cuenta();
		cuentaLLeno = new Cuenta(20,2000);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
		cuentaVacio = null;
		cuentaLLeno = null;
		
	}

	@Test
	void testCuenta() {
		assertEquals(10,cuentaVacio.getNumero());
		assertEquals(1000.0f,cuentaVacio.getSaldo(),0.01);
	}

	@Test
	void testCuentaIntFloat() {
		
		assertEquals(20,cuentaLLeno.getNumero());
		assertEquals(2000.0f,cuentaLLeno.getSaldo(),0.01);
	
	}

	@Test
	void testAcreditar() {
		cuentaVacio.acreditar(100.53f);
		assertEquals(1100.53f,cuentaVacio.getSaldo(),0.01);
	}

	@Test
	void testDebitar() {
		cuentaVacio.debitar(100);
		assertEquals(900.0f,cuentaVacio.getSaldo(),0.01);
	}

}
