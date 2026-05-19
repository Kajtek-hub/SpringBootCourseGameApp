package com.kajtek.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};
record Address (String firstLine, String city) {};

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
	
	@Bean (name = "address2")
	public Address address() {
		return new Address("Salma street","Divinty's Reach");
		
	}
}
