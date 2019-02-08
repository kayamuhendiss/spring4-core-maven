package com._03.sterotype.jsr330.test;
import com._03.sterotype.jsr330.domain.Employee;
import com._03.sterotype.jsr330.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AutowiringJSR330Test01 {
    public static void main(String[] args) {

        ApplicationContext context1 = new ClassPathXmlApplicationContext("steroType03.xml");

        Employee employee = context1.getBean("employee", Employee.class);

        EmployeeService empService = context1.getBean("employeeServiceImpl", EmployeeService.class);
        System.out.println(employee);
        empService.save(employee);

    }
}
