package com.grayblood.projectesplai.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "nom", length = 50, nullable = false)
	private String nom;
	@Column(name = "edad")
	private String edat;

	
	public Persona() {
		
	}
	public Persona(String nom, String edat) {
		super();
		this.nom = nom;
		edat = edat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEdat() {
		return edat;
	}

	public void setEdat(String edat) {
		this.edat = edat;
	}

}