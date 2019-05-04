package tn.isg.pfe.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.isg.pfe.model.Utilisateur;
@Repository
public interface UserRepository extends CrudRepository<Utilisateur, Integer> {
	
	public Utilisateur findByEmail(String email);
	
	@Query("select u from Utilisateur u where prenom=?1 ")
	public Utilisateur getUserByName(String prenom);

}
