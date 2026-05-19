package com.kajtek.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};
record Adress (String firstLine, String City) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name(){
		return "Kajta";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		return new Person("Taelia",18);
		//person.name(); person.age();
	}
	
	@Bean
	public Adress address() {
		return new Adress("Salma street","Divinty's Reach");
		
	}
}
