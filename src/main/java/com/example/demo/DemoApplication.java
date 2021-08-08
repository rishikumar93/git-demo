package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

	ConfigurableApplicationContext context=	SpringApplication.run(DemoApplication.class, args);
//context: it will intialise Spring container
	
	
	
	Alien a=context.getBean(Alien.class);
	a.show();
	
	Alien a2=context.getBean(Alien.class);
	a2.show();
	
	//By default, SPring uses SIngleton design pattern. SO only
//	one object will be created
	
	
//---------------------Prototype	
	
	}

}
