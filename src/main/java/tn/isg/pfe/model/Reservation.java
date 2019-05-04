package tn.isg.pfe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id_res", nullable = false, unique = true)
	private Long idRes;
	@Column(name = "id_ressource", nullable = false, unique = false)
	private int id_ressource;
	@Column(name = "ress_type", nullable = false, unique = false)
	private String resType;
	private int status;

	public Long getIdRes() {
		return idRes;
	}

	public void setIdRes(Long idRes) {
		this.idRes = idRes;
	}

	public int getId_ressource() {
		return id_ressource;
	}

	public void setId_ressource(int id_ressource) {
		this.id_ressource = id_ressource;
	}

	public String getResType() {
		return resType;
	}

	public void setResType(String resType) {
		this.resType = resType;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
