package tn.esprit.TimeSheetSpring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import tn.esprit.TimeSheetSpring.entity.Employe;
import tn.esprit.TimeSheetSpring.service.IEmployeService;

@Controller
public class TimeSheetController {

	@Autowired
	IEmployeService emps ;
	
	@RequestMapping("/sayHello")
	public String welcome(Map<String, Object> model, @RequestParam("name") String name) { 
		model.put("receivedName", name); 
	
	return "Accueil";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public String users(Employe user, Model model) { 
		model.addAttribute("user", new Employe());
		model.addAttribute("users", emps.EmployesName()); 
		return "Employes"; 
		}


}
