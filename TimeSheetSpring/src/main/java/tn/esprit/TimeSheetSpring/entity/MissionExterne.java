package tn.esprit.TimeSheetSpring.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class MissionExterne extends Mission {

	private String emailFacturation;
	private String tuaxJournalierMOyen;
	
	@ManyToOne
	private Departement departement;
	
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public String getEmailFacturation() {
		return emailFacturation;
	}
	public void setEmailFacturation(String emailFacturation) {
		this.emailFacturation = emailFacturation;
	}
	public String getTuaxJournalierMOyen() {
		return tuaxJournalierMOyen;
	}
	public void setTuaxJournalierMOyen(String tuaxJournalierMOyen) {
		this.tuaxJournalierMOyen = tuaxJournalierMOyen;
	}
	
}
