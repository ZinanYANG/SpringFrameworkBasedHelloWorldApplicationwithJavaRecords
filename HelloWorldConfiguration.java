// java up to date 
// jdk 17 up to date 
// eclipse up to date

package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


//put these in sep[erate files
//record Person(String name, int age, Address address) {}
//record Address(String firstLine, String city) {}



@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Alan";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("Alan Young ", 24, new Address("1345 S Wabash Ave ", "Chicago"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(), address()); // name age
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) { // name age address2
		return new Person(name,age, address3); // name age
	}
	
	@Bean
	@Primary
	//No qualifying bean of type 'com.in28minutes.learnspringframework.Address' 
	//available: expected single matching bean but found 2: address2,address3
	
	public Person person4Parameters(String name, int age, Address address) { // name age address2
		return new Person(name,age, address); // name age
	}
	

	@Bean(name="address2")
	@Primary
	public Address address() {
		return new Address("1333 S Wabash Ave ", "Chicago");
	}
	
	@Bean(name="address3")
	public Address address3() {
		return new Address("1345 S Wabash Ave ", "Chicago");
	}
	
	
}
