package com.sebasCode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebasCode.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
