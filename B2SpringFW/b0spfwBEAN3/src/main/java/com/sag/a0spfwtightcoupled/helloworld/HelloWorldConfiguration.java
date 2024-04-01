package com.sag.a0spfwtightcoupled.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//= to Eliminate verbosity in creating java Beans
//public accessor methods, constructor,
//equals, hashcode and toString are automatically created.
//Released in  JDK 16.

record Person (String name, int age, Address address) {};

record Address (String firstLine, String city) { };

@Configuration
public class HelloWorldConfiguration {
	
	
	//first try with one bean
	@Bean//indicates that a method produces a bean to be managed by the spring container.
	public String name() {
		return "Sidduganesh";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Aakash", 19, new Address("vn","hyd")); //automatic constructor
//		person.age(); //getter method
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name,age, address3);
	}

	@Bean(name="addressOfCustomer")
	public Address address() {
		var address = new Address("khanapur","Hyd");
		return address;
	}
	
	@Bean(name="address3")
	public Address address3() {
		var address = new Address("hmk","War");
		return address;
	}
}
