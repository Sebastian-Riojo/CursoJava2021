package com.sebasCode.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sebasCode.model.Persona;
import com.sebasCode.repo.IPersonaRepo;

@RestController
@RequestMapping("/personas")
public class RestDemoController {

	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping
	public List<Persona> listar(){
		
		insertar(new Persona(6,"SebasPag32"));
		return repo.findAll();
		
	}
	
	@PostMapping
	public void insertar(@RequestBody Persona Per) {
		repo.save(Per);
	}
	
}
