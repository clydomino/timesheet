package tn.esprit.TimeSheetSpring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Embeddable
public class TimeSheetId implements Serializable{


    private int employeId;
    private int missionId;
	private Date dateDebut;
	private Date dateFin;
	
	
	public int getEmployeId() {
		return employeId;
	}

	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

	public int getMissionId() {
		return missionId;
	}

	public void setMissionId(int missionId) {
		this.missionId = missionId;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
}
