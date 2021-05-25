package test.pivotal.pal.Tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

public class welcomecontrollertest {
       private String message;
    public welcomecontrollertest(@Value("$(welcome.message)")String message){
        this.message = message;


    }
    @GetMapping("/")
    public String sayHello() {
        return message;

    }
}
