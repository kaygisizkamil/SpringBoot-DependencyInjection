package com.example.dependenctInjection.DependencyInjection.Services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements  GreetingService{

    @Override
    public String sayHello() {
        return "Hello Spciety Setter injected";
    }
}
