package com.sag.a0spfwtightcoupled.helloworld;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld {

	public static void main(String[] args) {
		//1 : launch a spring context
		
		try (var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			//2 : configuration the things that we want spring to manage @Configuration
			System.out.println(context.getBean("name"));
			
			//spring is managing the object 
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("addressOfCustomer"));
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
