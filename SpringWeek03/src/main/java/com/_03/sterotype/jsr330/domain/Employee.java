package com._03.sterotype.jsr330.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value = "employee")
@PropertySource("02.configuration.properties")
public class Employee {
    @Value(value = "${name}")
    private String name;

    @Value(value = "${surname}")
    private String surname;

    @Autowired
    private Department department;



    /**
    *Birden fazla Bean varsa spring hata firlatir
    * org.springframework.beans.factory.NoUniqueBeanDefinitionException:
    * bu durumda @Qualifier(value=" ") annotation kullaniriz.
    */

    @Autowired
    private Address adress;

    public Address getAdress() {
        return adress;
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
    public String  toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department=" + department +
                ", adress=" + adress +
                '}';
    }
}
