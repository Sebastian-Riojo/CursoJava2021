package com.sebasPractica14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sebasPractica14.repository.IPersona;
import com.sebasPractica14.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	@Qualifier("persona1")
	IPersona repo;
	@Override
	public void registrarHandler(String Nombre) {

		repo.registrar(Nombre);
		
	}

}
