package com.kajtek.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {};
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
		return new Person("Taelia",18, new Address ("Ossan Quarter","Divinty's Reach"));
		//person.name(); person.age();
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name,age, address3);
	}
	
	@Bean (name = "address2")
	public Address address() {
		return new Address("Salma street","Divinty's Reach");
	}
	
	@Bean (name = "address3")
	public Address address3() {
		return new Address("Rurikton","Divinty's Reach");
	}
}
