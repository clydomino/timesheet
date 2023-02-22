package tn.esprit.TimeSheetSpring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.TimeSheetSpring.entity.Entreprise;

@Repository
public interface EntrepriseRepository extends CrudRepository<Entreprise, Integer>{

}
