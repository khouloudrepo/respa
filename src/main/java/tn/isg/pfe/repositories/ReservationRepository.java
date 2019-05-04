package tn.isg.pfe.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.isg.pfe.model.Reservation;
@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
	 
	
	

}
