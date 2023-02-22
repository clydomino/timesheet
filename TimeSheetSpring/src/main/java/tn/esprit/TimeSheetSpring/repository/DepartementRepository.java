package tn.esprit.TimeSheetSpring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.TimeSheetSpring.entity.Departement;

@Repository
public interface DepartementRepository extends CrudRepository<Departement, Integer>{

	@Query("select d.Name from Departement d where d.entreprise.Id = ?1")
	public List<String> AllDepartmentNamesByEnter(int interId);
}
