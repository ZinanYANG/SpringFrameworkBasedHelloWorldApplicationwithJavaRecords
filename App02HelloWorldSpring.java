package com.in28minutes.learnspringframework.helloworld;

import java.util.Arrays;
//import com.in28minutes.learnspringframework.game.Person;
//import com.in28minutes.learnspringframework.game.Address;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.superContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
//		1. luanch a Spring Context

		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);) {
//			2. Configure the things that we want Spring to manage = @Configuration
//			HelloWorldConfiguration - @Configuration
//			name - @Bean

//			3. Retrieve Beans managed by Spring 
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));

			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));

			System.out.println(context.getBean("address2"));

			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean(Address.class));

//			Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println);
		}

	}

}
