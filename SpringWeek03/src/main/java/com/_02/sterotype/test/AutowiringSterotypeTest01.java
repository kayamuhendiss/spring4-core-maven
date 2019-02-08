package com._02.sterotype.test;
import com._02.sterotype.domain.Employee;
import com._02.sterotype.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AutowiringSterotypeTest01 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("steroType02.xml");

        //
        // @Component isim verilmezse bean'in ismi sinif isminin camelCase yapisinda
        // olur.
        Employee employee = context.getBean("employeec", Employee.class);

        EmployeeService empService = context.getBean("employeeServiceImpl", EmployeeService.class);
        System.out.println(employee);
        empService.save(employee);

    }
}
