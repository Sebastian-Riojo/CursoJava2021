package com.domain.modelo.dao.selectStrategy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.domain.modelo.*;
import com.domain.modelo.dao.selectStrategy.*;

class SelectStrategyTest {

	Alumno aluVacio					;
	Alumno aluConCodigo				;
	Alumno aluConNombre				;	
	Alumno aluConNombreYapellido	;
	Alumno aluconEstudio			;
	Alumno aluConNombreEstudiosLink ;
	@BeforeEach
	public void setUp() throws Exception {
		aluVacio				= new Alumno()									;
		aluConCodigo 			= new Alumno(10)								;
		aluConNombre 			= new Alumno(0, "Gabriel",null, null, null)		;
		aluConNombreYapellido 	= new Alumno(0, "Gabriel", "Casas", null, null)	;	
		aluconEstudio 			= new Alumno(0, null, null, "DAM", null)		;
		aluConNombreEstudiosLink =new Alumno(0, "Gabriel", null, "DAM", "http://gitlab/gcasas1972")		;
	}

	@AfterEach
	public void tearDown() throws Exception {
		aluVacio	 			= null;
		aluConCodigo 			= null;
		aluConNombre 			= null;
		aluConNombreYapellido 	= null;	
		aluconEstudio 			= null;
		aluConNombreEstudiosLink =null;

		
	}
	@Test
	public void testGetSqlVacio(){
		 assertEquals("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos",
				 SelectStrategy.getSql(aluVacio));
	}
	@Test
	public void testGetSqlNull(){
		 assertEquals("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos",
				 SelectStrategy.getSql(null));
	}

	@Test
	public void testGetSqlConCodigo() {
		assertEquals("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos where alu_id=10",
					SelectStrategy.getSql(aluConCodigo));
	}
	
	@Test
	public void testGetSqlConNombre() {
		assertEquals("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos where alu_nombre like '%Gabriel%'",
					SelectStrategy.getSql(aluConNombre));
	}
	
	@Test
	public void testGetSqlConNombreYApellido() {
		assertEquals("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos where alu_nombre like '%Gabriel%' and alu_apellido like '%Casas%'",
					SelectStrategy.getSql(aluConNombreYapellido));
	}
	
	@Test
	public void testGetSqlEstudio() {
		assertEquals("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos where alu_estudios like '%DAM%'",
					SelectStrategy.getSql(aluconEstudio));
	}
	
	@Test
	public void testGetSqlLinkGitNombreEstudios() {
		assertEquals("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos where alu_nombre like '%Gabriel%' and alu_estudios like '%DAM%' and alu_linkgit like '%http://gitlab/gcasas1972%'",
					SelectStrategy.getSql(aluConNombreEstudiosLink));
	}

}
