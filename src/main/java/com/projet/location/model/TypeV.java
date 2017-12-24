package com.projet.location.model;

import org.springframework.data.annotation.Id;
/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
*/
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "type")
public class TypeV {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	 @Indexed(name = "nom_type")
	private String nom_type;
	
	 @Indexed(name = "tarif")
	private float tarif;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom_type() {
		return nom_type;
	}

	public void setNom_type(String nom_type) {
		this.nom_type = nom_type;
	}

	public float getTarif() {
		return tarif;
	}

	public void setTarif(float tarif) {
		this.tarif = tarif;
	}

	
}
