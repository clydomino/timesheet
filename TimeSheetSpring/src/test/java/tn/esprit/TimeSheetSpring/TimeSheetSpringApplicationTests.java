package tn.esprit.TimeSheetSpring;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.internal.compiler.env.IDependent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.TimeSheetSpring.entity.Departement;
import tn.esprit.TimeSheetSpring.entity.Employe;
import tn.esprit.TimeSheetSpring.entity.Entreprise;
import tn.esprit.TimeSheetSpring.entity.Mission;
import tn.esprit.TimeSheetSpring.entity.Role;
import tn.esprit.TimeSheetSpring.service.IEmployeService;
import tn.esprit.TimeSheetSpring.service.IEntrepriseService;
import tn.esprit.TimeSheetSpring.service.ITimeSheetService;

@SpringBootTest
class TimeSheetSpringApplicationTests {
@Autowired
IEmployeService emps;

@Autowired
IEntrepriseService entps;

@Autowired
ITimeSheetService tims;

	
	@Test
	void contextLoads() {
		//entps.ajouterEntreprise(new Entreprise(0, "SSI Consulting", "", null));
		//entps.ajouterDepartement(new Departement(0, "RH", null, null, null));
		//entps.ajouterDepartement(new Departement(0, "telecom", null, null, null));
		//tims.ajouterMission(new Mission(0, "Maintenance du SIRH interne", "Maintenance du SIRH interne", null));
		//tims.ajouterMission(new Mission(0, "Dev d'un nouvel outil de vente ", "Dev d'un nouvel outil de vente ", null));
		//tims.ajouterMission(new Mission(0, "Mise en place de la 4G", "Mise en place de la 4G", null));
	   /* emps.ajouterEmploye(new Employe(0, "Khaled", "Kallel", "khaled.kallel@gmail.com", true, Role.ingenieur, null, null));
	    emps.ajouterEmploye(new Employe(0, "Mohamed", "Zitoun", "mohamed.zitoun@gmail.com", true, Role.technicien, null, null));
	    emps.ajouterEmploye(new Employe(0, "Aymen", "Ouali", "aymen.ouali@gmail.com", true, Role.ingenieur, null, null));
	    emps.ajouterEmploye(new Employe(0, "Bochra", "Bouzid", "bochra.bouzid@gmail.com", true, Role.chefDepartement, null, null));
	    emps.ajouterEmploye(new Employe(0, "Yosra", "Arbi", "yosra.arbi@gmail.com", true, Role.chefDepartement, null, null));
	  */
		/*emps.affecterEmployeADepartement(13, 5);
		emps.affecterEmployeADepartement(14, 6);*/
		/*tims.ajouterTimesheet(1, 10, new Date(), new Date("2020/04/01"));
		tims.ajouterTimesheet(1, 11, new Date(), new Date("2020/04/01"));
		tims.ajouterTimesheet(2, 10, new Date(), new Date("2020/04/01"));
		tims.ajouterTimesheet(3, 11, new Date(), new Date("2020/04/01"));
		tims.ajouterTimesheet(3, 12, new Date(), new Date("2020/04/01"));*/
	}

}
