package _06.hibernate.dao;

import java.util.List;

import _06.hibernate.model.Person;

public interface PersonDAO {

	public void insert(Person person);

	public Person getPersonById(int id);

	public List<Person> getAllPersons();

	public void update(Person person);

	public void delete(int id);

}
