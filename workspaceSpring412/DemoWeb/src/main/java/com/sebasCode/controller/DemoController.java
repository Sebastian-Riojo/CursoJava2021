package com.sebasCode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sebasCode.model.Persona;
import com.sebasCode.repo.IPersonaRepo;

@Controller
public class DemoController {

	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/greetings")
	public String greeting(@RequestParam(name = "name" , required = false,
			defaultValue = "") String name , Model model){
		
		if(name == null || name.isEmpty()) {
			name = "SebasCode";
		}
		
		Persona per = new Persona();
		repo.save(per);
		
		model.addAttribute("name" , name);
		return "greeting";
		
	}
	
}
