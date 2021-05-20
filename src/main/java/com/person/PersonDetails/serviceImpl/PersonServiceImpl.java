package com.person.PersonDetails.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.PersonDetails.entity.person;
import com.person.PersonDetails.repository.PersonRepository;
import com.person.PersonDetails.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	 private PersonRepository personRepository;
	
	public PersonRepository getPersonRepository() {
		return personRepository;
	}

	public void setPersonRepository(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public List<person> retrievePersons() {
		List<person> employees = personRepository.findAll();
		return employees;
	}

	@Override
	public person getPerson(Long Id) {
		Optional<person> optPer = personRepository.findById(Id);
		  return optPer.get();
	}

	@Override
	public void savePerson(person person) {
		personRepository.save(person);
		
	}

	@Override
	public void deletePerson(Long Id) {
		personRepository.deleteById(Id);
		
	}

	@Override
	public void updatePerson(person person) {
		personRepository.save(person);	
	}	

}
