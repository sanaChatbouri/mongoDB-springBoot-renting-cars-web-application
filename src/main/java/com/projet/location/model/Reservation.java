package com.projet.location.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
*/
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "reservation")
public class Reservation {


	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	 public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Indexed(name = "dateArrive")
	private String dateArrive;
	
	 @Indexed(name = "destination")
	private String destination;
	 
	 public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}
	
	 @Indexed(name = "heureArrive")
	private String heureArrive;
	
	 @Indexed(name = "commentaire")
	private String commentaire;
	
	/* @Indexed(name = "nbVoyageur")
	private int nbVoyageur;*/

	public String getDateArrive() {
		return dateArrive;
	}

	public void setDateArrive(String dateArrive) {
		this.dateArrive = dateArrive;
	}

	

	public String getHeureArrive() {
		return heureArrive;
	}

	public void setHeureArrive(String heureArrive) {
		this.heureArrive = heureArrive;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	/*public int getNbVoyageur() {
		return nbVoyageur;
	}

	public void setNbVoyageur(int nbVoyageur) {
		this.nbVoyageur = nbVoyageur;
	}*/
	
	 @Indexed(name = "codeClient")
		private int codeClient;
	 
	 @Indexed(name = "matricule")
		private String matricule;

	public int getCodeClient() {
		return codeClient;
	}

	public void setCodeClient(int codeClient) {
		this.codeClient = codeClient;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	 
	 
}
	
	
	
	

