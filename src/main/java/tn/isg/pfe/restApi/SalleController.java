package tn.isg.pfe.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.isg.pfe.model.Salle;
import tn.isg.pfe.repositories.SalleRepository;

@RestController
public class SalleController {

	@Autowired
	private SalleRepository salleService;

	@CrossOrigin
	@RequestMapping("/allSalles")
	public List<Salle> getsalle() {
		return (List<Salle>) salleService.findAll();
}
}
