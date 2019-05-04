package tn.isg.pfe.model;

import java.sql.Time;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Reunion {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id_reunion", nullable = true, unique = false)
	private Long idReunion;
	private String sujet;
	private String initiateur;
	@Column(name = "date", nullable = false, unique = false)
	private Date dateDebut;
	@Column(name = "startTime", nullable = false, unique = false)
	private Time startTime;
	@Column(name = "endTime", nullable = false, unique = false)
	private Time endTime;
	@OneToMany(mappedBy = "reunion")
	private Set<Participant> participants;

	public Long getIdReunion() {
		return idReunion;
	}

	public void setIdReunion(Long idReunion) {
		this.idReunion = idReunion;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public String getInitiateur() {
		return initiateur;
	}

	public void setInitiateur(String initiateur) {
		this.initiateur = initiateur;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}



	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public Set<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(Set<Participant> participants) {
		this.participants = participants;
	}

}
