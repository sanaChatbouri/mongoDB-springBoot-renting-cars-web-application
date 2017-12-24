package com.projet.location.model;


import org.bson.types.ObjectId;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "client")
public class Client {


	@Id
private String id;

	public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

@Indexed(name="code")
private int code;
		    
		  public int getCode() {
	return code;
}

public void setCode(int code) {
	this.code = code;
}

		@Indexed(name="nom")
		    private String nom;
		 
		    
		  @Indexed(name="adresse")
		  private String adresse;
		    
		  @Indexed(name="tel")
		
			   private String tel;
		    
		  @Indexed(name="email")
			
			   private String email;

		
			public String getNom() {
				return nom;
			}

			public void setNom(String nom) {
				this.nom = nom;
			}

			public String getAdresse() {
				return adresse;
			}

			public void setAdresse(String adresse) {
				this.adresse = adresse;
			}

			public String getTel() {
				return tel;
			}

			public void setTel(String tel) {
				this.tel = tel;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}
		    
		    
		    
		    
}
