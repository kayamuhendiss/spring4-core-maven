package com._04.javabased.test;

import com._04.javabased.configuration.JavaBasedConfiguration;
import com._04.javabased.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigurationTest01 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedConfiguration.class);

		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
	}
}
