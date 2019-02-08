package com._06.bean.creation.lifecycle.configuration;

import com._06.bean.creation.lifecycle.model.BeanCreationLifeCycleWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBeanCreation {

    @Bean(initMethod = "testInitMethod")
    public BeanCreationLifeCycleWriter beanCreationLifeCycleWriter(){
        return new BeanCreationLifeCycleWriter();
    }
}
