package _05.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import _05.jpa.model.Person;

@Repository("personDAOImpl2")
public class PersonDAOImpl2 implements PersonDAO {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	private EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

	@Override
	public void insert(Person person) {
		EntityManager entityManager = getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(person);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@Override
	public Person getPersonById(int id) {
		EntityManager entityManager = getEntityManager();
		return entityManager.find(Person.class, id);
	}

	@Override
	public List<Person> getAllPersons() {
		EntityManager entityManager = getEntityManager();
		TypedQuery<Person> query = entityManager.createQuery("Select e from Person e", Person.class);
		return query.getResultList();
	}

	@Override
	public void update(Person person) {
		EntityManager entityManager = getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(person);
		entityManager.getTransaction().commit();
		entityManager.close();

	}

	@Override
	public void delete(int id) {
		EntityManager entityManager = getEntityManager();
		Person person = entityManager.find(Person.class, id);
		if (person != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(person);
			entityManager.getTransaction().commit();
		}

	}

}
