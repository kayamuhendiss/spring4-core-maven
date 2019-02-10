package _03.namedParameterJdbcTemplate.test;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import _03.namedParameterJdbcTemplate.configuration.JdbcConfiguration;
import _03.namedParameterJdbcTemplate.dao.PersonDAO;
import _03.namedParameterJdbcTemplate.model.Person;

public class NamedParameterJdbcTemplateTestAnnotation {
	public static void main(String[] args) throws SQLException {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfiguration.class);

		PersonDAO personDAO = ctx.getBean(PersonDAO.class);

		// create person object
		Person person = new Person(1, "Lvnt", "Erguder", 1989);

		// insert
		personDAO.insert(person);

		// find
		personDAO.getPersonById(1);

		// update
		person.setName("Levent");
		personDAO.update(person);

		// delete
		personDAO.delete(1);

		Person person2 = new Person(2, "James", "Gosling", 1955);
		Person person3 = new Person(3, "Joshua", "Bloch", 1961);

		personDAO.insert(person2);
		personDAO.insert(person3);

		// getAllPersons
		personDAO.getAllPersons();

		// deleteAllPersons		
		personDAO.deleteAllPersons();
		

	}
}
