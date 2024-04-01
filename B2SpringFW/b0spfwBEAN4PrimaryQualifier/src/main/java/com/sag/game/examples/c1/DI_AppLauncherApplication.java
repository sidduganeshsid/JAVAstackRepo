package com.sag.game.examples.c1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {
	
	//field injection is done through the reflection 
//	@Autowired
	Dependency1 dependency1;
	
//	@Autowired
	Dependency2 dependency2;
	
	
public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
	super();
	System.out.println("ConstructorInjection  - constructor1");
	this.dependency1 = dependency1;
	this.dependency2 = dependency2;
}


//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("SetterInjection - setter 1");
//		this.dependency1 = dependency1;
//	}
//
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("SetterInjection - setter 2");
//		this.dependency2 = dependency2;
//	}



	public String toString() {
		return "Using " + dependency1 + " and "+ dependency2;
	}
}

@Component
class Dependency1 {}

@Component
class Dependency2 {}


@Configuration
@ComponentScan
public class DI_AppLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext(DI_AppLauncherApplication.class);){
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println(context.getBean(YourBusinessClass.class));
		}

	}

}
