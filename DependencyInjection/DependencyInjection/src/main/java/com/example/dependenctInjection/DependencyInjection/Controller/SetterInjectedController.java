package com.example.dependenctInjection.DependencyInjection.Controller;

import com.example.dependenctInjection.DependencyInjection.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    GreetingService greetingService;
    //Qualifer should begin with small letter (?)
    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService=greetingService;
    }
    public String getGreeting(){
        return greetingService.sayHello();
    }
}
