package com.ots.dto;

import java.util.List;
import java.util.Set;

import org.springframework.data.neo4j.annotation.QueryResult;

import com.ots.core.domain.Location;
import com.ots.core.domain.Person;

@QueryResult
public class BirthData {

	private Location location;
	private Set<Person> personList;
	private String birthdate;
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Set<Person> getPersonList() {
		return personList;
	}
	public void setPersonList(Set<Person> personList) {
		this.personList = personList;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

}
