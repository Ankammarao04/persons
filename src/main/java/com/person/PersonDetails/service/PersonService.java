package com.person.PersonDetails.service;

import java.util.List;

import com.person.PersonDetails.entity.person;

public interface PersonService {

	public List<person> retrievePersons();
	  
	 public person getPerson(Long Id);
	  
	 public void savePerson(person person);
	  
	 public void deletePerson(Long Id);
	  
	 public void updatePerson(person person);
}
