package tn.esprit.TimeSheetSpring.service;

import java.util.List;

import tn.esprit.TimeSheetSpring.entity.Departement;
import tn.esprit.TimeSheetSpring.entity.Entreprise;

public interface IEntrepriseService {
public List<Departement> allDepartements();
public int ajouterEntreprise(Entreprise entreprise); 
public int ajouterDepartement(Departement dep); 
void affecterDepartementAEntreprise(int depId, int entrepriseId); 
List<String> getAllDepartementsNamesByEntreprise(int entrepriseId);

}
