package com.sebasPractica14.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.sebasPractica14.DemoConsolaApplication;

@Repository
@Qualifier("persona2")
public class PersonaRepoImpl2 implements IPersona{

	private static Logger Log = LoggerFactory.getLogger(DemoConsolaApplication.class);

	@Override
	public void registrar(String Nombre) {
		Log.info("Se registro Felizmente...a:" + Nombre);
		
	}
	
}
