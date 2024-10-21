package com.grayblood.projectesplai.Repositoris;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.grayblood.projectesplai.model.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {

	public List<Persona> findAll();

	public void delete(Persona i);

	public Persona save(Persona person);

}
