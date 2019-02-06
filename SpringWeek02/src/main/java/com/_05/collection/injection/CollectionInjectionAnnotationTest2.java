package com._05.collection.injection;


import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectionAnnotationTest2 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("CollectionInjectionDataAnnotation2.xml");
        CollectionInjectionDataAnnotation2 collectionInjection=context.getBean("collectionInjectionAnnotation",CollectionInjectionDataAnnotation2.class);
        List<String> myList = collectionInjection.getMyList();
        List<Person> myPerson = collectionInjection.getPersonList();
        Set<Integer> mySet = collectionInjection.getMySet();
        Map<String, Object> myMap = collectionInjection.getMyMap();
        Properties myProperties = collectionInjection.getMyProperties();

        System.out.println("myList elements : ");
        // for (String element : myList) {
        // System.out.println(element);
        // }

        // java8
        myList.stream().forEach(System.out::println);

        System.out.println("myPerson elements : ");
        // for (Person element : myPerson) {
        // System.out.println(element);
        // }

        // java8
        myPerson.stream().forEach(System.out::println);

        System.out.println("mySet elements : ");
        // for (Integer element : mySet) {
        // System.out.println(element);
        // }

        // java8
        mySet.forEach(System.out::println);

        System.out.println("myMap elements : ");
        // for (Object element : myMap.keySet()) {
        // System.out.println(myMap.get(element));
        // }

        // java8
        myMap.forEach((k, v) -> System.out.println("key : " + k + " value : " + v));

        System.out.println("myProperties elements : ");
        // for (Map.Entry<Object, Object> entry : myProperties.entrySet()) {
        // System.out.println(entry.getKey() + " " + entry.getValue());
        // }

        // java8
        myProperties.forEach((k, v) -> System.out.println("key : " + k + " value : " + v));

        ((ClassPathXmlApplicationContext) context).close();
    }
}
