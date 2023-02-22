package tn.esprit.TimeSheetSpring.service;

import java.util.Date;

import tn.esprit.TimeSheetSpring.entity.Mission;

public interface ITimeSheetService {
	 public int ajouterMission(Mission mission);
	 public void affecterMissionADepartement(int missionId, int depId);
	 public void ajouterTimesheet(int missionId, int employeId, Date dateDebut, Date dateFin);

}
