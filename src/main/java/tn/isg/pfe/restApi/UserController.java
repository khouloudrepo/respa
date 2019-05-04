package tn.isg.pfe.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.isg.pfe.model.Utilisateur;
import tn.isg.pfe.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	//recuperer les requetes httpw
	@CrossOrigin
	@RequestMapping("/allPersons")
	public List<Utilisateur> getName() {
		
		// envoyer les données au service concerné pour le traiter et le retouner au client
		return (List<Utilisateur>) userService.findAll();
	
	}
}
