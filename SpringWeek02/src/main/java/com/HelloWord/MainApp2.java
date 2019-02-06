package HelloWord;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans2.xml");
        HelloWord2 helloWord2=(HelloWord2) context.getBean("deneme");
        helloWord2.getMessage();

    }
}
