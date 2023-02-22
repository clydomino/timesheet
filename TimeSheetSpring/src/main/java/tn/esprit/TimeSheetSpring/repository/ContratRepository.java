package tn.esprit.TimeSheetSpring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.TimeSheetSpring.entity.Contrat;

@Repository
public interface ContratRepository extends CrudRepository<Contrat, Integer> {

}
