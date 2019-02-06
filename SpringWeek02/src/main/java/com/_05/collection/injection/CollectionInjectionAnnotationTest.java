package com._05.collection.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectionAnnotationTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("collectionInjectionAnnotation.xml");
		CollectionInjectionDataAnnotation data = context.getBean("collectionInjectionDataAnnotationId", CollectionInjectionDataAnnotation.class);

		System.out.println(data);
	}
}
