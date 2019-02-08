package com._08.message.source.test;

import com._08.message.source.configuration.ConfigurationMessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class MessageSourcetTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext=new AnnotationConfigApplicationContext(ConfigurationMessageSource.class);

        String msg1=configApplicationContext.getMessage("product.name",new Object[]{}, Locale.US);
        System.out.println(msg1);

        String msg1_TR=configApplicationContext.getMessage("product.name",new Object[]{},new Locale("tr","TR"));
        System.out.println(msg1_TR);

        String msg2=configApplicationContext.getMessage("order.information",new Object[]{"Order Id-100","250","$"},Locale.US);
        System.out.println(msg2);

    }
}
