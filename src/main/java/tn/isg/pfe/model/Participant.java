package tn.isg.pfe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Participants")

public class Participant {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id", nullable = true, unique = false)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_reunion", nullable=false)
	private Reunion reunion;
	private int user_id;
	


	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Reunion getReunion() {
		return reunion;
	}


	public void setReunion(Reunion reunion) {
		this.reunion = reunion;
	}

}
