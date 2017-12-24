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

@Document(collection = "vihicule")
public class Vihicule {

	@Id
	private String id;

		public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	 @Indexed(name="matricule")
	    private String matricule;
	 

	 
	 @Indexed(name="marque")
	  private String marque;
	    
	 @Indexed(name="nombre_place")
	
		   private String nombre_place;

	

		
		

		public String getMatricule() {
			return matricule;
		}

	

		public void setMatricule(String matricule) {
			this.matricule = matricule;
		}

		public String getMarque() {
			return marque;
		}

		public void setMarque(String marque) {
			this.marque = marque;
		}

		public String getNombre_place() {
			return nombre_place;
		}

		public void setNombre_place(String nombre_place) {
			this.nombre_place = nombre_place;
		}
	    
		 @Indexed(name="nom_type")
			
		   private String nom_type;

		public String getNom_type() {
			return nom_type;
		}

		public void setNom_type(String nom_type) {
			this.nom_type = nom_type;
		}
		 
		 @Indexed(name="nom_local")
			
		   private String nom_local;

		public String getNom_local() {
			return nom_local;
		}

		public void setNom_local(String nom_local) {
			this.nom_local = nom_local;
		}
		 

	
	   
}
