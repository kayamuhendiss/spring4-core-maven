package com._03.beanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-beanFactory.xml");
        Car car=context.getBean("carId",Car.class);
        car.drive();
    }
}
