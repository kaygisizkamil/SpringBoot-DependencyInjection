package com.example.dependenctInjection.DependencyInjection.Controller;

import com.example.dependenctInjection.DependencyInjection.Services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
  GreetingService gs;
   public MyController(GreetingService gs){
       this.gs=gs;
   }
   public String getGreeting(){
       return gs.sayHello();
   }
}
