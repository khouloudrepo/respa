package tn.isg.pfe.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.isg.pfe.model.Equipement;

@Repository
public interface EquipementRepository extends CrudRepository<Equipement, Integer> {
	
	@Query("select e from Equipement e ")
	public List<Equipement>  getAllEquipement();
	
	public Equipement findByMatricule(String matricule);


}
	
		