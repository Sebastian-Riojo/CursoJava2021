package com.sebasPractica14;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sebasPractica14.service.IPersonaService;


@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner{

	private static Logger Log = LoggerFactory.getLogger(DemoConsolaApplication.class);
	
	@Autowired
	private IPersonaService service;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//service = new PersonaServiceImpl();
		service.registrarHandler("Sebas");
		
		/*
		Log.info("Impresión en consola");
		Log.warn("Esto es una advertencia");
		Log.error("Esto es un error");
		*/
		
	}

}
