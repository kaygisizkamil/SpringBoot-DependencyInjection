package com.example.dependenctInjection;

import com.example.dependenctInjection.DependencyInjection.Controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/***
 * a Spring bean is an object that form the backbone of your application and that is managed by the Spring IoC container.
 * A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. Otherwise, a bean is simply one of many objects in your application.
 * Beans, and the dependencies among them, are reflected in the configuration metadata used by a container.
 */

/**
 * The ApplicationContext is the central interface within a Spring application that is used for providing
 * configuration information to the application. It's created when the application starts running.
 */
@SpringBootApplication
public class DependencyInjectionApplication {

 	public static void main(String[] args)
	{
		ApplicationContext cx=SpringApplication.run(DependencyInjectionApplication.class, args);
		//not needed to create an onject spring does that itself

		I18NController i18NController=(I18NController)cx.getBean("i18NController");
		System.out.println(i18NController.sayHello());
		System.out.println("------PRIMARY");
		MyController myController=(MyController)  cx.getBean("myController");
		System.out.println(myController.getGreeting());

		System.out.println("CTOR----");
		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController)
																		cx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
		System.out.println("PROPERTY---");
		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) cx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("SETTER---");
		SetterInjectedController setterInjectedController=(SetterInjectedController) cx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
	}

}
