package com.example.dependenctInjection.DependencyInjection.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")
@Service("I18N")
public class I18NENGLISH implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello guys";
    }
}
