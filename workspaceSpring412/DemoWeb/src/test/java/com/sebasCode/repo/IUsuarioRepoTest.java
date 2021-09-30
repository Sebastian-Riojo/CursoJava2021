package com.sebasCode.repo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.sebasCode.model.Usuario;

@SpringBootTest
class IUsuarioRepoTest {

	@Autowired
	IUsuarioRepo usuRepo;
	Usuario usu; 
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	@BeforeEach
	void empezar() throws Exception{
		
		usu = new Usuario(0,"Sebas",encoder.encode("sebas123"));
		
	}
	
	@AfterEach
	void terminar() throws Exception{
		
		usu = null;
		
	}
	
	@Test
	void testAgregar() {
		Usuario usuRetorno = usuRepo.save(usu);
		assertEquals(usu.getClave(),usuRetorno.getClave());
	}

}
