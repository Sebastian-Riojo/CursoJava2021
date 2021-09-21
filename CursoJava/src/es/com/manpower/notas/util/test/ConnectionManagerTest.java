package es.com.manpower.notas.util.test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.com.manpower.notas.util.ConnectionManager;

class ConnectionManagerTest {

	Connection con;
	
	@BeforeEach
	public void setUp() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manpower","root","sistema");
		
		 ConnectionManager.conectar();
	}
	
	@After
	public void tearDown() throws SQLException {
		
		con = null;
		ConnectionManager.desconectar();
		
	}
	
	@Test
	void testConectar() {
		try {
			
			ConnectionManager.conectar();
			assertFalse(ConnectionManager.getConnection().isClosed());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testDesconectar() {
		try {
			ConnectionManager.desconectar();
			assertTrue(ConnectionManager.getConnection().isClosed());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			assertTrue(false);
			e.printStackTrace();
		}
		
	}

	@Test
	void testGetConnection() throws SQLException {
		
		assertFalse(ConnectionManager.getConnection().isClosed());
		
	}

}
