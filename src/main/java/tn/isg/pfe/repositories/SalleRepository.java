package tn.isg.pfe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.isg.pfe.model.Salle;

@Repository
public interface SalleRepository extends CrudRepository<Salle, Integer> {
	
//	@Query ("select s from salle s")
//	public Salle[] getSallesBy...();
	public Salle findByNom(String nom);
}
