package com._02.sterotype.service;

import com._02.sterotype.domain.Employee;
import com._02.sterotype.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void save(Employee emp) {
        //validation yapilir

        employeeRepository.save(emp);

    }
}
