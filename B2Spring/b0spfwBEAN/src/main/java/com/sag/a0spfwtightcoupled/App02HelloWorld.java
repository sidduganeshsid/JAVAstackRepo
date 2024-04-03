package com.sag.a0spfwtightcoupled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld {

	public static void main(String[] args) {
		//1 : launch a spring context
		
		var context =new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//2 : configuration the things that we want spring to manage @Configuration
		System.out.println(context.getBean("name"));
		
		//spring is managing the object 
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		System.out.println(context.getBean("addressOfCustomer"));
		
//		System.out.println(context.getBean(Address.class)); //type of the bean
//		Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException:
//		No qualifying bean of type 'com.sag.a0spfwtightcoupled.Address' available: 
//		expected single matching bean but found 2: addressOfCustomer,address3
		
		
		
//		System.out.println("working");
	}

}
