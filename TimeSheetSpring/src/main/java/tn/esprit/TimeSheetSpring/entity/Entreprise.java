package tn.esprit.TimeSheetSpring.entity;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Entreprise implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Enter_ID")
	private int  Id;
	
	
	public Entreprise(int id, String name, String raisonSocial, List<Departement> departments) {
		super();
		Id = id;
		Name = name;
		RaisonSocial = raisonSocial;
		this.departments = departments;
	}

	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String Name;
	private String RaisonSocial;
	
	@OneToMany(mappedBy ="entreprise" , cascade = {CascadeType.PERSIST ,CascadeType.REMOVE},
	fetch = FetchType.EAGER)
	private List<Departement> departments= new ArrayList<Departement>();

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRaisonSocial() {
		return RaisonSocial;
	}

	public void setRaisonSocial(String raisonSocial) {
		RaisonSocial = raisonSocial;
	}

	public List<Departement> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Departement> departments) {
		this.departments = departments;
	}
	
	public void addDepartment(Departement department) {
		department.setEntreprise(this);
		this.departments.add(department);
	}
}
