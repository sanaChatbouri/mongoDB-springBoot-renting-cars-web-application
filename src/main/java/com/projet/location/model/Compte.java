package com.projet.location.model;

import org.springframework.data.annotation.Id;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;*/

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "compte")
public class Compte {

	@Id
	
	private String id;

	 @Indexed(name = "login")
	private String login;

	@Indexed(name = "password")
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String passwpord) {
		this.password = passwpord;
	}
	 @Indexed(name = "codeAd")
		private Long codeAd;

	public Long getCodeAd() {
		return codeAd;
	}

	public void setCodeAd(Long codeAdmin) {
		this.codeAd = codeAdmin;
	}
	 
	
}
