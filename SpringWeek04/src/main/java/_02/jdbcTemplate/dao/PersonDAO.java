package _02.jdbcTemplate.dao;

import java.util.List;

import _02.jdbcTemplate.model.Person;

public interface PersonDAO {

	public void insert(Person person);

	public Person getPersonById(int id);

	public List<Person> getAllPersons();

	public void update(Person person);

	public void delete(int id);

	public void deleteAllPersons();
}
