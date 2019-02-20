package _31.jpa.declarative.transaction.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import _31.jpa.declarative.transaction.configuration.ConfigurationJPA;
import _31.jpa.declarative.transaction.model.Address;
import _31.jpa.declarative.transaction.model.Customer;
import _31.jpa.declarative.transaction.service.CustomerService;

public class SpringJPADeclarativeTransactionAnnotationTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationJPA.class);

		// get CustomerService bean
		CustomerService customerService = context.getBean(CustomerService.class);

		// prepare Customer and Address data.
		Customer customer = new Customer(1, "Zuleyha", "Kaya");
		Address address = new Address(1, "Java Street", "34000", "Istanbul");
		customer.setAddress(address);

		//
		Customer customer2 = new Customer(2, "Deryaa", "Erpis");
		Address address2 = new Address(2, "Bakanliklar Street", "06000", "Ankara");
		customer2.setAddress(address2);

		Customer customer3 = new Customer(3, "Eminee", "Gencel");
		// duplicate Address id , throw exception
		// customers3 record will be rollbacked too.
		Address address3 = new Address(2, "Alemdag Road", "34000", "Istanbul");
		customer3.setAddress(address3);

		customerService.insertCustomerData(customer);
		customerService.insertCustomerData(customer2);

		try {
			customerService.insertCustomerData(customer3);
		} catch (Exception e) {
			System.out.println("Rollback...");
			System.out.println(e.getMessage());
		}

		//
		System.out.println("Customer List : ");
		for (Customer customerRecord : customerService.listCustomers()) {
			System.out.println(customerRecord);
		}

		context.close();

	}
}
