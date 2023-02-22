package tn.esprit.TimeSheetSpring.entity;


import java.io.Serializable;
import javax.persistence.*;

@Entity
public class TimeSheet implements Serializable {

	@EmbeddedId
	TimeSheetId pk;
	
	@ManyToOne
	@JoinColumn(name="employeId",insertable=false,updatable=false)
	private Employe employe;
	
	@ManyToOne
	@JoinColumn(name="missionId",insertable=false,updatable=false)
	private Mission mission;
	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	private boolean isValide;
	

	public boolean isValide() {
		return isValide;
	}

	public void setValide(boolean isValide) {
		this.isValide = isValide;
	}

	public TimeSheetId getPk() {
		return pk;
	}

	public void setPk(TimeSheetId pk) {
		this.pk = pk;
	}

	
	
}
