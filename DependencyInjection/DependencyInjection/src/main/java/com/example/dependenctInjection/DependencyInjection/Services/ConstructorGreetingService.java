package com.example.dependenctInjection.DependencyInjection.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{

    @Override
    public String sayHello() {
        return"Hllo Society Constructor Innjected";
    }
}
