package tn.esprit.TimeSheetSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.TimeSheetSpring.entity.Contrat;
import tn.esprit.TimeSheetSpring.entity.Departement;
import tn.esprit.TimeSheetSpring.entity.Employe;
import tn.esprit.TimeSheetSpring.repository.ContratRepository;
import tn.esprit.TimeSheetSpring.repository.DepartementRepository;
import tn.esprit.TimeSheetSpring.repository.EmployeRepository;

@Service
public class EmployeService implements IEmployeService{
 @Autowired
 EmployeRepository emprep;
 
 @Autowired
DepartementRepository depprep;
 
 @Autowired
 ContratRepository contrep;
	
	@Override
	public Long EmployesCount() {
		// TODO Auto-generated method stub
		return emprep.count();
	}

	@Override
	public List<String> EmployesName() {
		// TODO Auto-generated method stub
		return emprep.nameEmployes();
	}

	@Override
	public int ajouterEmploye(Employe employe) {
		// TODO Auto-generated method stub
		emprep.save(employe);
		return employe.getId();
	}

	@Override
	public void affecterEmployeADepartement(int employeId, int depId) {
		// TODO Auto-generated method stub
		Optional<Employe> emp = emprep.findById(employeId);
		Optional<Departement> dep = depprep.findById(depId);
		dep.get().getEmployes().add(emp.get());
		depprep.save(dep.get());
		
	}

	@Override
	public int ajouterContrat(Contrat contrat) {
		// TODO Auto-generated method stub
		contrep.save(contrat);
		return contrat.getReference();
	}

	@Override
	public void affecterContratAEmploye(int contratId, int employeId) {
		// TODO Auto-generated method stub
		Optional<Employe> emp = emprep.findById(employeId);
		Optional<Contrat> contrat = contrep.findById(contratId);
		contrat.get().setEmploye(emp.get());
		contrep.save(contrat.get());
		
	}

	@Override
	public String getEmployePrenomById(int employeId) {
		// TODO Auto-generated method stub
		return emprep.findById(employeId).get().getPrenom();
	}

	@Override
	public long getNombreEmployeJPQL() {
		// TODO Auto-generated method stub
		return emprep.count();
	}

	@Override
	public List<String> getAllEmployeNamesJPQL() {
		// TODO Auto-generated method stub
		return EmployesName();
	}

	@Override
	public Employe GetEmployeByID(int id) {
		// TODO Auto-generated method stub
		return emprep.findById(id).get();
	}

	@Override
	public void deleteEmploye(int id) {
		// TODO Auto-generated method stub
		emprep.deleteById(id);
	}

	@Override
	public Employe updateEmploye(Employe e) {
		// TODO Auto-generated method stub
		Employe em = emprep.findById(e.getId()).get();
		em.setEmail(e.getEmail());
		em.setNom(e.getNom());
		em.setPrenom(e.getPrenom());
		emprep.save(em);
		return em;
	}

}
