package com.person.PersonDetails.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class person {
	
	 @Id
	 @GeneratedValue(strategy= GenerationType.AUTO)
	 private Long id;
	  
	 @Column(name="FIRST_NAME")
	 private String firstName;
	  
	 @Column(name="SUR_NAME")
	 private String surName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

}
