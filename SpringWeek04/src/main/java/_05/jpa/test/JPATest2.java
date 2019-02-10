package _05.jpa.test;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import _05.jpa.configuration.ConfigurationJPA;
import _05.jpa.dao.PersonDAO;
import _05.jpa.dao.PersonDAOImpl2;
import _05.jpa.model.Person;


public class JPATest2 {
	public static void main(String[] args) throws SQLException {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationJPA.class);


		PersonDAO pService = ctx.getBean(PersonDAOImpl2.class);

		// create person object
		Person person1 = new Person("oldName", "oldSurname", 1989);

		// insert
		pService.insert(person1);

		// find
		Person foundPerson = pService.getPersonById(1);
		System.out.println("Found ... " + foundPerson);

		// update
		person1.setName("Levent");
		person1.setSurname("Erguder");
		pService.update(person1);
		System.out.println("After Update...");

		// find
		foundPerson = pService.getPersonById(1);
		System.out.println("Found ... " + foundPerson);

		Person person2 = new Person("James", "Gosling", 1955);
		Person person3 = new Person("Joshua", "Bloch", 1961);

		pService.insert(person2);
		pService.insert(person3);

		// delete
		pService.delete(1);

		// list
		List<Person> personList = pService.getAllPersons();
		System.out.println("Listing...");
		for (Person p : personList) {
			System.out.println(p);
		}

	}
}
