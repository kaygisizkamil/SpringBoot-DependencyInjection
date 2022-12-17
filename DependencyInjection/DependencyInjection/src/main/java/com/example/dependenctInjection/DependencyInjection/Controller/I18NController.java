package com.example.dependenctInjection.DependencyInjection.Controller;

import com.example.dependenctInjection.DependencyInjection.Services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {
    GreetingService greetingService;
    public I18NController(@Qualifier("I18N") GreetingService greetingService){
        this.greetingService=greetingService;
    }
    public String sayHello(){
       return greetingService.sayHello();
    }


}
