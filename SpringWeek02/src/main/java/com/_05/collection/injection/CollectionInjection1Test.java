package com._05.collection.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection1Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("collectioninjection1.xml");
        CollectionInjection1 collectionInjection1=context.getBean("collectionInjection1",CollectionInjection1.class);
        List<String> myList = collectionInjection1.getMyList();
        List<Person> myPerson = collectionInjection1.getMyList2();
        Set<Integer> mySet = collectionInjection1.getMySet();
        Map<String, Object> myMap = collectionInjection1.getMyMap();
        Properties myProperties = collectionInjection1.getMyProperties();
        System.out.println("myList elements : ");
        for (String element:myList){
            System.out.println(element);
        }
        System.out.println("myPerson elements : ");
        myPerson.stream().forEach(System.out::println);

        System.out.println("mySet elements : ");
        mySet.stream().forEach(System.out::println);

        System.out.println("myMap elements : ");
        myMap.forEach((k, v) -> System.out.println("key : " + k + " value : " + v));


        System.out.println("myProperties elements : ");
        myProperties.forEach((k, v) -> System.out.println("key : " + k + " value : " + v));

        ((ClassPathXmlApplicationContext) context).close();

    }
}
