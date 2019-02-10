package _03.namedParameterJdbcTemplate.dao;

import java.util.List;

import _03.namedParameterJdbcTemplate.model.Person;

public interface PersonDAO {

	 void insert(Person person);

	 Person getPersonById(int id);

	 List<Person> getAllPersons();

	 void update(Person person);

	public void delete(int id);
	
	public void deleteAllPersons();
}
