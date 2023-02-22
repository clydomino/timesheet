package tn.esprit.TimeSheetSpring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.TimeSheetSpring.entity.Employe;

@Repository
public interface EmployeRepository extends CrudRepository<Employe, Integer>{
    @Query("select e.nom ||' '|| e.prenom from Employe e")
    public List<String> nameEmployes();
	
}
