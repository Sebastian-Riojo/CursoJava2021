package com.sebasCode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebasCode.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
	
	public Usuario findByNombre(String user);
	
}
