package com._04.javabased.configuration;

import com._04.javabased.model.Address;
import com._04.javabased.model.Department;
import com._04.javabased.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


//java base configuration icin ilgili annotation gerekli
@Configuration
@ComponentScan(basePackages ="com._04.javabased.model")
@PropertySource(value = "04.configuration.properties")

public class JavaBasedConfiguration {

    @Autowired
    private Environment environment;

    @Bean
    public Employee employee(){

       String name=environment.getProperty("environment.name");
       String surname=environment.getProperty("environment.surname");
       Employee employee=new Employee();
       employee.setName(name);
       employee.setSurname(surname);
       return employee;

    }


    @Value(value = "${departmentName}")
    private String departmentName;

    @Bean
    public Department department()
    {
       Department department=new Department();
       department.setDepartmentName(departmentName);
        System.out.println("Department is bean created...");
       return department;
    }

    @Value(value = "${city}")
    private String city;

    @Bean
    public Address address(){
        Address address=new Address();
        address.setCity(city);
        return address;
    }

}
