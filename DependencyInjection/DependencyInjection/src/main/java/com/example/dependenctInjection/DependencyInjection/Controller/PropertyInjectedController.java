package com.example.dependenctInjection.DependencyInjection.Controller;

import com.example.dependenctInjection.DependencyInjection.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    GreetingService greetingService;


    public String getGreeting() {
      return  greetingService.sayHello();
    }
}
