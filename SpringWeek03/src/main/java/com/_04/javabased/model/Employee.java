package com._04.javabased.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "02.configuration.properties")
public class  Employee {



	private String name;


	private String surname;

	@Autowired
	private Department department;

	@Autowired
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}


	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", department=" + department +
				", address=" + address +
				'}';
	}
}
