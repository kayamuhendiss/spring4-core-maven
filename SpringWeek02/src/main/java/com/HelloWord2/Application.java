package HelloWord2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;


@Configuration
@ComponentScan
public class Application {
    @Bean
    public HelloWordService getMessageService() {
        return new HelloWorldServiceImpl(); }

    public static void main(String[] args) {
      final  ApplicationContext context =new AnnotationConfigApplicationContext(Application.class);
        final MessageManager manager =context.getBean(MessageManager.class);
        manager.printMessage();
    }
}
