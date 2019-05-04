package tn.isg.pfe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.isg.pfe.model.Reunion;
@Repository
public interface ReunionRepository extends  CrudRepository<Reunion, Integer> {
	
	

}
