package tn.isg.pfe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.isg.pfe.model.Ressources;

@Repository
public interface RessourcesRespository  extends CrudRepository<Ressources, Integer>{

}
