package com.example.dependenctInjection.DependencyInjection.Services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements  GreetingService{

    @Override
    public String sayHello() {
        return "Hello Society Property Injected";
    }
}
