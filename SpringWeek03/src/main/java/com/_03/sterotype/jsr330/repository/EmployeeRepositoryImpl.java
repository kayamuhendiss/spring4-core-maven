package com._03.sterotype.jsr330.repository;

import com._03.sterotype.jsr330.domain.Employee;
import org.springframework.stereotype.Repository;

import javax.inject.Named;

//@Repository
@Named
public class EmployeeRepositoryImpl  implements EmployeeRepository {
    public void save(Employee emp) {
        System.out.println("EmployeeRepositoryImple####save!!!!");

    }
}
