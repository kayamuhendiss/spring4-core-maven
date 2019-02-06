package com._02.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeSetterInjectionTest {
    public static void main(String[] args) {
        ApplicationContext c=new ClassPathXmlApplicationContext("setterinjection2XmlBean.xml");
        SetterInjection2 s=c.getBean("empId",SetterInjection2.class);
        System.out.println(s);

}
}
