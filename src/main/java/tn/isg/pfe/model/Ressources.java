package tn.isg.pfe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Ressources {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int idRessource;
	private int idResevation;
	private int idReuinion;
	public int getIdRessource() {
		return idRessource;
	}
	public void setIdRessource(int idRessource) {
		this.idRessource = idRessource;
	}
	public int getIdResevation() {
		return idResevation;
	}
	public void setIdResevation(int idResevation) {
		this.idResevation = idResevation;
	}
	public int getIdReuinion() {
		return idReuinion;
	}
	public void setIdReuinion(int idReuinion) {
		this.idReuinion = idReuinion;
	}
	
}
