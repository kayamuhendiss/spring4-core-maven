package _01.jdbc.test;

import _01.jdbc.model.Person;
import _01.jdbc.repository.PersonRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01JDBC {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("01.spring.jdbc.xml");
        PersonRepository pService=context.getBean(PersonRepository.class);

        Person person1=new Person(1,"Zuleyha","Kaya",1993);
        pService.save(person1);
    }
}
