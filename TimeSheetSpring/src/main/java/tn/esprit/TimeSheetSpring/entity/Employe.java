package tn.esprit.TimeSheetSpring.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Employe implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Employ_ID")
	private int id;
	private String prenom;
	private String nom;
	private String email;
	private boolean isActif = false;
	private Role role;
	
	@ManyToMany(mappedBy = "employes",fetch = FetchType.EAGER)
	private List<Departement> departements = new ArrayList<Departement>();

	@OneToOne(mappedBy = "employe" ,cascade = CascadeType.REMOVE)
	private Contrat contrat;
	
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(int id, String prenom, String nom, String email, boolean isActif, Role role,
			List<Departement> departements, Contrat contrat) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.isActif = isActif;
		this.role = role;
		this.departements = departements;
		this.contrat = contrat;
	}

	/*@OneToMany(mappedBy = "pk.employe")
	private List<TimeSheet> timesheets;*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActif() {
		return isActif;
	}

	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}

	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public List<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}

	/*public List<TimeSheet> getTimesheets() {
		return timesheets;
	}

	public void setTimesheets(List<TimeSheet> timesheets) {
		this.timesheets = timesheets;
	}*/
	
}
