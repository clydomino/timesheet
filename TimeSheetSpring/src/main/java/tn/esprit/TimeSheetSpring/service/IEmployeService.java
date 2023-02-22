package tn.esprit.TimeSheetSpring.service;

import java.util.List;

import tn.esprit.TimeSheetSpring.entity.Contrat;
import tn.esprit.TimeSheetSpring.entity.Employe;

public interface IEmployeService {
	
public Long EmployesCount();
public List<String> EmployesName();

public int ajouterEmploye(Employe employe); 
public void affecterEmployeADepartement(int employeId, int depId); 
public int ajouterContrat(Contrat contrat); 
public void affecterContratAEmploye(int contratId, int employeId);
public String getEmployePrenomById(int employeId); 
public long getNombreEmployeJPQL();
public List<String> getAllEmployeNamesJPQL();
public Employe GetEmployeByID(int id);
public void deleteEmploye(int id);
public Employe updateEmploye(Employe e);

}
