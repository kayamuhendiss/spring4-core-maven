package com._01.autowiring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    private String name;
    private String surname;

    @Autowired
    private Department department;

    @Autowired
    @Qualifier(value = "addressId")

    /**
    *Birden fazla Bean varsa spring hata firlatir
    * org.springframework.beans.factory.NoUniqueBeanDefinitionException:
    * bu durumda @Qualifier(value=" ") annotation kullaniriz.
    */
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
