package com._06.bean.creation.lifecycle.test;

import com._05.awareness.configuration.ConfigurationAwareness;
import com._05.awareness.model.SpringAwarenessWriter;
import com._06.bean.creation.lifecycle.configuration.ConfigurationBeanCreation;
import com._06.bean.creation.lifecycle.model.BeanCreationLifeCycleWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanCreationLifeCycleTest {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationBeanCreation.class);
        BeanCreationLifeCycleWriter springAwarenessWriter=context.getBean(BeanCreationLifeCycleWriter.class);

    }
}
