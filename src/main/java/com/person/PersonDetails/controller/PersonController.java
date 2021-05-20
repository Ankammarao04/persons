package com.person.PersonDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.PersonDetails.entity.person;
import com.person.PersonDetails.service.PersonService;

@RestController
@RequestMapping("/api")
public class PersonController {

	@Autowired
	 private PersonService personService;
	  
	 public void setPersonService(PersonService personService) {
	  this.personService = personService;
	 }
	 
	 @GetMapping("persons")
	 public List<person> getPersons() {
	  List<person> persons = personService.retrievePersons();
	  return persons;
	 }
	  
	 @GetMapping("/persons/{Id}")
	 public person getPerson(@PathVariable(name="Id")Long Id) {
	  return personService.getPerson(Id);
	 }
	  
	 @PostMapping("/api/person")
	 public void saveEmployee(person person){
		 personService.savePerson(person);
	  System.out.println("Person Saved Successfully");
	 }
	  
	 @DeleteMapping("/persons/{Id}")
	 public void deletePerson(@PathVariable(name="Id")Long Id){
		 personService.deletePerson(Id);
	  System.out.println("Person Deleted Successfully");
	 }
	  
	 @PutMapping("/personss/{Id}")
	 public void updateEmployee(@RequestBody person person,
	   @PathVariable(name="Id")Long Id){
	  person per = personService.getPerson(Id);
	  if(per != null){
		  personService.updatePerson(person);
	  }
	   
	 }
}
