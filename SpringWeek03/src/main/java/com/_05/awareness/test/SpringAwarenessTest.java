package com._05.awareness.test;

import com._05.awareness.configuration.ConfigurationAwareness;
import com._05.awareness.model.SpringAwarenessWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAwarenessTest {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationAwareness.class);
        SpringAwarenessWriter springAwarenessWriter=context.getBean(SpringAwarenessWriter.class);

    }
}
