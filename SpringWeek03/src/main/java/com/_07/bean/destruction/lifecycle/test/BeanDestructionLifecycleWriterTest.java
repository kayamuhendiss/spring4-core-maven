package com._07.bean.destruction.lifecycle.test;

import com._07.bean.destruction.lifecycle.configuration.ConfigurationBeanDestruction;
import com._07.bean.destruction.lifecycle.model.BeanDestructionLifecycleWriter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDestructionLifecycleWriterTest {
    public static void main(String[] args) {
        //
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBeanDestruction.class);

        BeanDestructionLifecycleWriter writer = context.getBean(BeanDestructionLifecycleWriter.class);

        context.close(); // Destruction cycle icin close edilmesi gerekli.
    }
}
