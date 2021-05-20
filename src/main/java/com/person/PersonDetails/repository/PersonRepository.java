package com.person.PersonDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.person.PersonDetails.entity.person;

@Repository
public interface PersonRepository extends JpaRepository<person,Long>{

}
