package com.sag.game.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DI_AppLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext(DI_AppLauncherApplication.class);){
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}

}
