package tn.isg.pfe.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.isg.pfe.model.Reservation;
import tn.isg.pfe.repositories.ReservationRepository;

@RestController
public class ReservationController {
	@Autowired
	private ReservationRepository reservationService;
	
	@CrossOrigin
	@RequestMapping("/allreservation")
	public List<Reservation> getAll() {
		return (List<Reservation>)reservationService.findAll();
	}
}

