package com._02.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfuseConstructorInjectionTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ConstructorConfuseBean.xml");
        ConstructorConfuse c= context.getBean("constBean",ConstructorConfuse.class) ;
        ConstructorConfuse o=context.getBean("constBean2",ConstructorConfuse.class);
        System.out.println(c);
        System.out.println(o);
    }
}
