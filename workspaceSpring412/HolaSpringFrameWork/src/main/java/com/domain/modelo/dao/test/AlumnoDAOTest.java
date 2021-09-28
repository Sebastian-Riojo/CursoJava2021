package com.domain.modelo.dao.test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.domain.modelo.dao.*;
import com.domain.util.*;

import com.domain.modelo.daoo.*;
import com.domain.modelo.*;

public class AlumnoDAOTest {

	DAO alumnoDAO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ConnectionManager.conectar();
		Connection con = ConnectionManager.getConnection();
		
	    Statement consulta= con.createStatement();
	
	    String sql = "";
	    BufferedReader bf = new BufferedReader(new InputStreamReader( AlumnoDAOTest.class.getResource( "AlumnosCrear.sql" ).openStream() ) );
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
	    BufferedReader bf = new BufferedReader( new InputStreamReader( AlumnoDAOTest.class.getResource( "AlumnosEliminar.sql" ).openStream() ) );
	    while ( (sql = bf.readLine()) != null ) {
	       if ( sql.trim().length() != 0 &&
	            !sql.startsWith( "--" ) ) {              
	          consulta.executeUpdate( sql );
	       }
	    }
	    ConnectionManager.desconectar();
	}

	@Before
	public void setUp() throws Exception {
		
		alumnoDAO = new AlumnoDAO();
		
	}

	@After
	public void tearDown() throws Exception {
		
		alumnoDAO = null;
		
	}

	@Test
	public void testAgregar() {
		
		try {
			alumnoDAO.agregar(new Alumno(0,"Sebas_Test","Riojo_Test" , "GDAM_Test" , "Repositorio_Test"));
			
			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConnection();
			
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select alu_nombre from alumnos where alu_nombre = 'Sebas_Test'");
			rs.next();
			assertEquals("Sebas_Test",rs.getString("alu_nombre"));
			
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
			
			ResultSet rs = st.executeQuery("select ALU_ID from alumnos where alu_nombre = 'Marina_test'");
			rs.next();
			
			Alumno alumno = new Alumno(rs.getInt("ALU_ID"),"MarinaModif_Test","Calvo_PereñaModif_Test" , "FisicaModif" , "RepositorioModif");
			alumnoDAO.modificar(alumno);
			
			rs = st.executeQuery("select ALU_ID , ALU_NOMBRE , ALU_APELLIDO , ALU_ESTUDIOS , ALU_LINKGIT from alumnos where alu_nombre = 'MarinaModif_Test'");
			rs.next();
			Alumno alu = new Alumno(rs.getInt("ALU_ID"),rs.getString("ALU_NOMBRE"),rs.getString("ALU_APELLIDO"),rs.getString("ALU_ESTUDIOS"),rs.getString("ALU_LINKGIT"));
			
			assertEquals(alu.getCodigo(), alumno.getCodigo());
			assertEquals(alu.getNombre(),alumno.getNombre());
			assertEquals(alu.getApellido(),alumno.getApellido());
			assertEquals(alu.getEstudios(),alumno.getEstudios());
			assertEquals(alu.getGit(),alumno.getGit());
			
			
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
			
			ResultSet rs = st.executeQuery("select ALU_ID, ALU_NOMBRE , ALU_APELLIDO , ALU_ESTUDIOS , ALU_LINKGIT from alumnos where alu_nombre = 'Monsef_Test'");
			rs.next();
			
			Alumno alumno = new Alumno(rs.getInt("ALU_ID"), rs.getString("ALU_NOMBRE"), rs.getString("ALU_APELLIDO"), rs.getString("ALU_ESTUDIOS"), rs.getString("ALU_LINKGIT"));
			alumnoDAO.eliminar(alumno);
			
		    rs = st.executeQuery("select ALU_NOMBRE from alumnos where ALU_NOMBRE = 'Monsef_test'");
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
			
			ResultSet rs = st.executeQuery("select ALU_ID from alumnos where alu_nombre = 'Aarón_test'");
			rs.next();
			
			Alumno alu = new Alumno(rs.getInt("ALU_ID"));
			List<Model> alumnos = alumnoDAO.leer(alu);
			
			assertEquals("Aarón_test", ((Alumno)alumnos.get(0)).getNombre());
			assertEquals("Sánchez Sánchez_test", ((Alumno)alumnos.get(0)).getApellido());
			assertEquals("Desarrollo de Aplicaciones Multiplataforma_test", ((Alumno)alumnos.get(0)).getEstudios());
			assertEquals("https://github.com/Pashinian/CursoJava2021.git_test", ((Alumno)alumnos.get(0)).getGit());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
