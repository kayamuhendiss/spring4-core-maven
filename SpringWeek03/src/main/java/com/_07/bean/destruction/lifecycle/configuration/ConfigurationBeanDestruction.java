package com._07.bean.destruction.lifecycle.configuration;

import com._07.bean.destruction.lifecycle.model.BeanDestructionLifecycleWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBeanDestruction {

    @Bean(destroyMethod = "testDestroyMethod")
    public BeanDestructionLifecycleWriter beanDestructionLifecycleWriter()
    {
        return new BeanDestructionLifecycleWriter();
    }

}
