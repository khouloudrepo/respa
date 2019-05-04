package tn.isg.pfe.services.impl;

import java.sql.Time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.isg.pfe.dto.MeetingDto;
import tn.isg.pfe.model.Equipement;
import tn.isg.pfe.model.Participant;
import tn.isg.pfe.model.Reservation;
import tn.isg.pfe.model.Reunion;
import tn.isg.pfe.model.Salle;
import tn.isg.pfe.model.Utilisateur;
import tn.isg.pfe.repositories.EquipementRepository;
import tn.isg.pfe.repositories.ParticipantRepository;
import tn.isg.pfe.repositories.ReservationRepository;
import tn.isg.pfe.repositories.ReunionRepository;
import tn.isg.pfe.repositories.SalleRepository;
import tn.isg.pfe.repositories.UserRepository;
import tn.isg.pfe.services.ReunionService;

@Service
public class ReunionServiceImpl implements ReunionService {

	@Autowired
	ReunionRepository reunionRepository;

	@Autowired
	ReservationRepository reservationRepository;
	@Autowired
	SalleRepository salleRepository;

	@Autowired
	EquipementRepository equipementRepository;
	@Autowired
	ParticipantRepository participantRepository;
	@Autowired
	UserRepository userRepository;

	public void createMeeting(MeetingDto meetingDto) {
		Reunion reunion = new Reunion();
		reunion.setDateDebut(meetingDto.getDateDebut());
		//reunion.setStartTime(meetingDto.getStartime());
		reunion.setStartTime(new Time(meetingDto.getStartTime().getTime()));
		reunion.setEndTime(new Time(meetingDto.getEndTime().getTime()));
		reunion.setInitiateur("");
		reunion.setSujet(meetingDto.getSujet());
		Reservation reservation = new Reservation();
		Salle salle = salleRepository.findByNom(meetingDto.getSalle());
		reservation.setId_ressource(salle.getId());
		reservation.setStatus(0);
		reservation.setResType("SALLE");
		reservationRepository.save(reservation);
		if (!meetingDto.getEquipements().isEmpty()) {
			for (String mat : meetingDto.getEquipements()) {
				if (mat != null) {
					Reservation reservationMat = new Reservation();
					Equipement eq = equipementRepository.findByMatricule(mat);
					reservationMat.setId_ressource(eq.getId());
					reservationMat.setStatus(0);
					reservationMat.setResType("EQUIPEMENT");
					reservationRepository.save(reservationMat);
				}
			}
		}
		reunionRepository.save(reunion);
		if (!meetingDto.getParticipants().isEmpty()) {
			for (String email : meetingDto.getParticipants()) {
				Utilisateur utilisateur = userRepository.findByEmail(email);
				if (utilisateur != null) {
					Participant participant = new Participant();
					participant.setUser_id(utilisateur.getId());
					participant.setReunion(reunion);
					participantRepository.save(participant);

				}
			}
		}

	}
}
