package com._03.sterotype.jsr330.service;

import com._03.sterotype.jsr330.domain.Employee;
import com._03.sterotype.jsr330.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Named;

//@Service
@Named
public class EmployeeServiceImpl implements EmployeeService {
    //@Autowired
    @Named

    //#@Autowired yerine @Inject annotation kullanabiliriz
    private EmployeeRepository employeeRepository;

    public void save(Employee emp) {
        //validation yapilir

        employeeRepository.save(emp);

    }
}
