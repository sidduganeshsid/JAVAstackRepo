package com.sag.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sag.game.BusinessCalculationService;


@Configuration
@ComponentScan("com.sag.game")
public class MainAppLauncher {
	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(MainAppLauncher.class);
		
		System.out.println(context.getBean(BusinessCalculationService.class).findMax());

	}

}
