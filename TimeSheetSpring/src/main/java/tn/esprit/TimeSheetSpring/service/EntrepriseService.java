package tn.esprit.TimeSheetSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.TimeSheetSpring.entity.Departement;
import tn.esprit.TimeSheetSpring.entity.Entreprise;
import tn.esprit.TimeSheetSpring.repository.DepartementRepository;
import tn.esprit.TimeSheetSpring.repository.EntrepriseRepository;

@Service
public class EntrepriseService implements IEntrepriseService{
@Autowired
DepartementRepository deprep;

@Autowired
EntrepriseRepository entrerep;
	
	@Override
	public List<Departement> allDepartements() {
		// TODO Auto-generated method stub
		return (List<Departement>)deprep.findAll();
	}

	@Override
	public int ajouterEntreprise(Entreprise entreprise) {
		// TODO Auto-generated method stub
		entrerep.save(entreprise);
		return entreprise.getId();
	}

	@Override
	public int ajouterDepartement(Departement dep) {
		// TODO Auto-generated method stub
		deprep.save(dep);
		return dep.getId();
	}

	@Override
	public void affecterDepartementAEntreprise(int depId, int entrepriseId) {
	  Optional<Departement> dep=	deprep.findById(depId);
	  dep.get().setEntreprise(entrerep.findById(entrepriseId).get());
	  deprep.save(dep.get());
	}

	@Override
	public List<String> getAllDepartementsNamesByEntreprise(int entrepriseId) {
		
		return  deprep.AllDepartmentNamesByEnter(entrepriseId);
	}

}
