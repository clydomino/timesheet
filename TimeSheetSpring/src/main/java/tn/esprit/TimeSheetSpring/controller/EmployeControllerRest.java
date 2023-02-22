package tn.esprit.TimeSheetSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.TimeSheetSpring.entity.Employe;
import tn.esprit.TimeSheetSpring.service.IEmployeService;

@RestController
public class EmployeControllerRest {

	 @Autowired 
	 IEmployeService emps;
	 @GetMapping("/retrieve-all-users")
	 @ResponseBody 
	 public List<String> getUsers() {
		 List<String> list = emps.EmployesName(); 
		 return list; 
		 } 
	 
	  @GetMapping("/retrieve-user/{user-id}") 
	  @ResponseBody 
	  public Employe retrieveUser(@PathVariable("user-id") int userId) { 
		  return emps.GetEmployeByID(userId); 
		  } 
	  
	@PostMapping("/add-user") 
	@ResponseBody 
	public Employe addUser(@RequestBody Employe u) { 
		emps.ajouterEmploye(u);
		return u; 
		}
     
	 @DeleteMapping("/remove-user/{user-id}") 
	 @ResponseBody 
	 public void removeUser(@PathVariable("user-id") int userId) { 
		 emps.deleteEmploye(userId); 
		 } 
	 @PutMapping("/modify-user") 
	 @ResponseBody 
	 public Employe modifyUser(@RequestBody Employe user) {
		 return  emps.updateEmploye(user); 
		 }

}
