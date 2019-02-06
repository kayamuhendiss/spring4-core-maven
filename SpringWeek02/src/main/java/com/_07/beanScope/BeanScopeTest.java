package com._07.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beanScope.xml");
        Student student=context.getBean("studentId",Student.class);
        Student student2=context.getBean("studentId",Student.class);
        Student student3=context.getBean("studentId",Student.class);
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student2==student3);

        // true donerler!
        // Springte default olarak "bean" scope u singletondir !


        // scope olarak protype dedik!
        // her lookup isleminde (getBean) yeni bir obje olusur!

        Teacher teacher1 = context.getBean("teacherId",Teacher.class);
        Teacher teacher2 = context.getBean("teacherId",Teacher.class);
        Teacher teacher3 = context.getBean("teacherId",Teacher.class);

        System.out.println(teacher1);
        System.out.println(teacher2);
        System.out.println(teacher3);

        System.out.println(teacher1 == teacher2);
        System.out.println(teacher2 == teacher3);


    }
}
