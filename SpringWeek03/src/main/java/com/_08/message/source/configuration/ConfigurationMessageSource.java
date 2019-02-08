package com._08.message.source.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class ConfigurationMessageSource {
    @Bean
    public ResourceBundleMessageSource messageSource(){
        ResourceBundleMessageSource source=new ResourceBundleMessageSource();
        source.setBasename("locale.bundle.springMessages");
        source.setDefaultEncoding("UTF-8");
        return source;
    }
}
