package tn.isg.pfe.dto;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class MeetingDto {
	private Date dateDebut;
	private Date startTime;
	private Date endTime;
	private String sujet;
	private String message;
	private List<String> participants;
	private String salle;
	private List<String> equipements;

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getParticipants() {
		return participants;
	}

	public void setParticipants(List<String> participants) {
		this.participants = participants;
	}

	public String getSalle() {
		return salle;
	}

	public void setSalle(String salle) {
		this.salle = salle;
	}

	public List<String> getEquipements() {
		return equipements;
	}

	public void setEquipements(List<String> equipements) {
		this.equipements = equipements;
	}


	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	
	


}
