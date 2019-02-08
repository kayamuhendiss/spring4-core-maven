package com._05.awareness.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringAwarenessWriter implements BeanNameAware, BeanClassLoaderAware, ApplicationContextAware {

    //Bir bean olusturulurken adimlar yer almakta
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("setBeanClassLoader is invoked!");
        System.out.println(classLoader.getClass());

    }

    public void setBeanName(String name) {
        System.out.println("setBeanName is invoked");


    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext is invoked!");

    }
}
