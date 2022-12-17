package com.example.dependenctInjection.DependencyInjection.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"TR","default"})//when there is no active profile set,inside app propertis there might be more than 1 active
@Service("I18N")
public class I18NTURKISH implements GreetingService{
    @Override
    public String sayHello() {
        return "Merhaba";
    }
}
