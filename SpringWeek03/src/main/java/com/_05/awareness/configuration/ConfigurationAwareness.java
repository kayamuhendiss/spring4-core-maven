package com._05.awareness.configuration;

import com._05.awareness.model.SpringAwarenessWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationAwareness {
    @Bean
    public SpringAwarenessWriter springAwerenessWriter(){
        return new SpringAwarenessWriter();

    }
}
