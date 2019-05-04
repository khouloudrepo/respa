package tn.isg.pfe.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.isg.pfe.model.Equipement;
import tn.isg.pfe.repositories.EquipementRepository;

@RestController
public class EquipementController {
	@Autowired
	private EquipementRepository EquipementService;
	

	@CrossOrigin
	@RequestMapping("/allEquipemets")
	public List<Equipement> getALL() {
		return EquipementService.getAllEquipement();
	}
}
