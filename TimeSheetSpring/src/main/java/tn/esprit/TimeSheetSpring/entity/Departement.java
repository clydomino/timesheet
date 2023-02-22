package tn.esprit.TimeSheetSpring.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Departement implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Depart_ID")
	private int id;
	private String Name;
	
	@ManyToOne
	private Entreprise entreprise;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Employe> employes = new ArrayList<Employe>();
	
	@OneToMany(mappedBy ="departement" /*, fetch = FetchType.EAGER*/)
	private List<Mission> missions = new ArrayList<Mission>();

	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departement(int id, String name, Entreprise entreprise, List<Employe> employes, List<Mission> missions) {
		super();
		this.id = id;
		Name = name;
		this.entreprise = entreprise;
		this.employes = employes;
		this.missions = missions;
	}

	public List<Mission> getMissions() {
		return missions;
	}

	public void setMissions(List<Mission> missions) {
		this.missions = missions;
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	
	
}
