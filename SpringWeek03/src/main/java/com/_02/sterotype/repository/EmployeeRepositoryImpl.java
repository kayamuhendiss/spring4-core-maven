package com._02.sterotype.repository;

import com._02.sterotype.domain.Employee;
import org.springframework.stereotype.Repository;

@Repository
//default olarak sinif ismi ile camelCase yapida ismi olur
//employeeRepositoryImpl

// @Repository(value = "employeeRepositoryImpl") bu sekildede verebiliyoruz
public class EmployeeRepositoryImpl  implements EmployeeRepository{
    public void save(Employee emp) {
        System.out.println("EmployeeRepositoryImple####save!!!!");

    }
}
