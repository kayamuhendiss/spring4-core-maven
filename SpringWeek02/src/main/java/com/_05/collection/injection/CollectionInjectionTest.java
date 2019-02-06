package com._05.collection.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectionTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("collectionInjectionBean.xml");
        CollectionInjectionData c= context.getBean("CollInjBean",CollectionInjectionData.class);
        System.out.println(c);
    }
}
