package tn.isg.pfe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.isg.pfe.model.Participant;

@Repository
public interface ParticipantRepository  extends CrudRepository<Participant, Integer>{

}
