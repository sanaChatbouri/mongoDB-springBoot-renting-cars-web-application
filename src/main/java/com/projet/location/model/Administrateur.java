package com.projet.location.model;

import org.springframework.data.annotation.Id;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "admin")
//@Entity
public class Administrateur {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	 @Indexed(name = "nom")
	private String nom;
	 
	 @Indexed(name = "code")
		private String code;
	 

	 public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Indexed(name = "email")
	private String email;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	
}
