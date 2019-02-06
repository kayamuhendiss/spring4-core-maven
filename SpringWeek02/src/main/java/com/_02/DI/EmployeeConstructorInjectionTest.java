package com._02.DI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployeeConstructorInjectionTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("constInjectionEmployee.xml");
        EmployeeConstructorInjection employee = ctx.getBean("empId", EmployeeConstructorInjection.class);
        System.out.println(employee);
    }
}
