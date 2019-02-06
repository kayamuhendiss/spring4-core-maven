package HelloWord2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageManager {
    @Autowired
    HelloWordService service;

    public void printMessage() {
        System.out.println(this.service.getMessage()
        );
    }


}
