package com.emp.dao;

import java.awt.List;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.emp.model.Person;


@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao{

	private static ArrayList<Person> DB = new ArrayList<Person>();

	@Override
	public int insertPerson(UUID id, Person person) {
		DB.add(new Person(id, person.getName()));
		return 1;
	}	
	
}
