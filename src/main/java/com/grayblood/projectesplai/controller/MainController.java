package com.grayblood.projectesplai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.grayblood.projectesplai.Repositoris.PersonaRepository;
import com.grayblood.projectesplai.model.Persona;

@CrossOrigin // Para hacer peticiones desde otro servidor
@RestController // Para hacer peticiones REST
@RequestMapping("/people")
public class MainController {

	@Autowired
	private PersonaRepository personaRepository;



	@PostMapping("/")
	public void createPeople(@RequestBody Persona person) {
		personaRepository.save(person);
	}

	@DeleteMapping("/{id}")
	public void deletePeople(@PathVariable("id") Integer id) {
		Persona i = new Persona();
		i.setId(id);
		personaRepository.delete(i);
	}

	@GetMapping
	public List<Persona> selectPeople() {
		List<Persona> people = personaRepository.findAll();
		return people;
	}

	@PutMapping("/{id}")
	public void updatePeople(@RequestBody Persona person, @PathVariable("id") Integer id) {
		person.setId(id);
		personaRepository.save(person);
	}
}