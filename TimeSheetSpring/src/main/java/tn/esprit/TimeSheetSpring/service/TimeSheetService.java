package tn.esprit.TimeSheetSpring.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.TimeSheetSpring.entity.Departement;
import tn.esprit.TimeSheetSpring.entity.Mission;
import tn.esprit.TimeSheetSpring.entity.TimeSheet;
import tn.esprit.TimeSheetSpring.entity.TimeSheetId;
import tn.esprit.TimeSheetSpring.repository.DepartementRepository;
import tn.esprit.TimeSheetSpring.repository.EmployeRepository;
import tn.esprit.TimeSheetSpring.repository.MissionRepository;
import tn.esprit.TimeSheetSpring.repository.TimeSheetRepository;

@Service
public class TimeSheetService implements ITimeSheetService{
@Autowired
MissionRepository mres;

@Autowired
TimeSheetRepository timres;

@Autowired
DepartementRepository depres;

@Autowired
EmployeRepository emplres;
	
	@Override
	public int ajouterMission(Mission mission) {
		// TODO Auto-generated method stub
		mres.save(mission);
		return mission.getId();
	}

	@Override
	public void affecterMissionADepartement(int missionId, int depId) {
		Optional<Mission> mission = mres.findById(missionId);
		Optional<Departement> depart = depres.findById(depId);
		mission.get().setDepartement(depart.get());
		mres.save(mission.get());
		
	}

	@Override
	public void ajouterTimesheet(int missionId, int employeId, Date dateDebut, Date dateFin) {
		// TODO Auto-generated method stub
		TimeSheetId Tid = new TimeSheetId();
		Tid.setDateDebut(dateDebut);
		Tid.setDateFin(dateFin);
		Tid.setEmployeId(employeId);
		Tid.setMissionId(missionId);
		TimeSheet tm = new TimeSheet();
		tm.setPk(Tid);
		timres.save(tm);
	}

}
