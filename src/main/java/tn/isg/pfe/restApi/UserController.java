package tn.isg.pfe.restApi;

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
	
	@CrossOrigin
	@RequestMapping("/name")
	public Utilisateur getName() {
		return userService.getUserByName("khouloud");
		
	}
}
