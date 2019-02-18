package tn.isg.pfe.services;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.isg.pfe.model.Utilisateur;

public interface UserService extends CrudRepository<Utilisateur, Integer> {

	@Query("select u from Utilisateur u where prenom=?1 ")
	public Utilisateur getUserByName(String prenom);

}
