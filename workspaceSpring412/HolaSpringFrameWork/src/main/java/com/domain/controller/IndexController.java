package com.domain.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.domain.modelo.Alumno;
import com.domain.modelo.daoo.AlumnoDAO;

@Controller
public class IndexController {

	@RequestMapping("/home")
	public String goIndex() {
		
		return "Index";
		
	}
	
	@RequestMapping("/")
	public String getPresentacion() {
		
		return "Presentación";
		
	}
	
	@RequestMapping("/listado")
	public String goListado(Model model) {
		
		List<String> alumnos = new ArrayList<String>();
		alumnos.add("Juan");
		alumnos.add("Pedro");
		alumnos.add("Jose");
		
		model.addAttribute("titulo", "Listado de alumnos");
		model.addAttribute("profesor", "Gabriel Casas");
		model.addAttribute("alumnos", alumnos);
		
		return "Listado";
		
	}
	
	@RequestMapping("/alumnos")
	public String getAlumnos(Model model) throws ClassNotFoundException, SQLException {
		
		AlumnoDAO dao = new AlumnoDAO();
		Alumno alu = new Alumno();
		List<com.domain.modelo.Model> alumnos = dao.leer(alu);
		
		model.addAttribute("titulo", "Listado de alumnos");
		model.addAttribute("lista", "Leer Lista de alumnos");
		model.addAttribute("alumnos", alumnos);
		
		return "Alumnos";
		
	}
	
}
