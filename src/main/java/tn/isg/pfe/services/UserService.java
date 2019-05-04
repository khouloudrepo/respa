package tn.isg.pfe.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import tn.isg.pfe.model.Utilisateur;

@Service
public interface UserService {

	public Utilisateur getUserByName(String prenom);
	
	public List<Utilisateur> findAll();

}
