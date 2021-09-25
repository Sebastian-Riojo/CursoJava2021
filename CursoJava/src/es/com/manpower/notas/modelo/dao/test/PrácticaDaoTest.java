package es.com.manpower.notas.modelo.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.com.manpower.notas.modelo.Model;
import es.com.manpower.notas.modelo.Practica;
import es.com.manpower.notas.modelo.dao.DAO;
import es.com.manpower.notas.modelo.dao.PrácticaDao;
import es.com.manpower.notas.util.ConnectionManager;

class PrácticaDaoTest {

	DAO practicaDAO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ConnectionManager.conectar();
		Connection con = ConnectionManager.getConnection();
		
	    Statement consulta= con.createStatement();
	
	    String sql = "";
	    BufferedReader bf = new BufferedReader(new InputStreamReader( AlumnoDAOTest.class.getResource( "PracticasCrear.sql" ).openStream() ) );
	    while ( (sql = bf.readLine()) != null ) {
	       if ( sql.trim().length() != 0 &&
	            !sql.startsWith( "--" ) ) {              
	          consulta.executeUpdate( sql );
	       }
	    }
	    ConnectionManager.desconectar();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		ConnectionManager.conectar();
		Connection con = ConnectionManager.getConnection();
		
	    Statement consulta= con.createStatement();
	
	    String sql = "";
	    BufferedReader bf = new BufferedReader( new InputStreamReader( AlumnoDAOTest.class.getResource( "PracticasDelete.sql" ).openStream() ) );
	    while ( (sql = bf.readLine()) != null ) {
	       if ( sql.trim().length() != 0 &&
	            !sql.startsWith( "--" ) ) {              
	          consulta.executeUpdate( sql );
	       }
	    }
	    ConnectionManager.desconectar();
	}

	@BeforeEach
	public void setUp() throws Exception {
		
		practicaDAO = new PrácticaDao();
		
	}

	@AfterEach
	public void tearDown() throws Exception {
		
		practicaDAO = null;
		
	}

	@Test
	public void testAgregar() {
		
		try {
			practicaDAO.agregar(new Practica(0,"SebasAgrego"));
			
			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConnection();
			
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select prac_nombre from practicas where prac_nombre = 'SebasAgrego'");
			rs.next();
			assertEquals("SebasAgrego",rs.getString("prac_nombre"));
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void testModificar() {
		
		try {
			
			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConnection();
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select prac_id , prac_nombre from practicas where prac_nombre = 'practicaSebasMod1'");
			rs.next();
			
			Practica practica = new Practica(rs.getInt("prac_id"),"SebasMod1Modificado");
			practicaDAO.modificar(practica);
			
			rs = st.executeQuery("select prac_id , prac_nombre from practicas where prac_nombre = 'SebasMod1Modificado'");
			rs.next();
			Practica prac = new Practica(rs.getInt("prac_id"),rs.getString("prac_nombre"));
			
			assertEquals(prac.getPracticaID(), practica.getPracticaID());
			assertEquals(prac.getPracticaNombre(), practica.getPracticaNombre());
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void testEliminar() {
		
		try {
			
			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConnection();
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select prac_id , prac_nombre from practicas where prac_nombre = 'practicaSebasEliminar'");
			rs.next();
			
			Practica practica = new Practica(rs.getInt("prac_id"), rs.getString("prac_nombre"));
			practicaDAO.eliminar(practica);
			
		    rs = st.executeQuery("select prac_nombre from practicas where prac_nombre = 'practicaSebasEliminar'");
			assertFalse(rs.next());
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void testLeer() {
		
		try {
			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConnection();
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select prac_id , prac_nombre from practicas where prac_nombre = 'practicaSebasLeer1'");
			rs.next();
			
			Practica practica = new Practica(rs.getInt("prac_id"),rs.getString("prac_nombre"));
			List<Model> practicas = practicaDAO.leer(practica);
			
			
			assertEquals("practicaSebasLeer1", ((Practica)practicas.get(0)).getPracticaNombre());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
