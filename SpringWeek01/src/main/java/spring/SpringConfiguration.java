package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    @Bean
    public Vehicle car(){
        Car car= new Car();
        car.setWheel(lassa());
        return car;
    }

    @Bean
    public Wheel lassa(){
      return new Lassa();


    }
}
