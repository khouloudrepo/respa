package tn.isg.pfe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipement {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name="id", nullable = false, unique = true)
	private int id;
	private String matricule;
	private String nom;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	

	
	
}
