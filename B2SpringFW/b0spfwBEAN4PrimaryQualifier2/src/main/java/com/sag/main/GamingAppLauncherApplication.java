package com.sag.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sag.game.GameRunner;
import com.sag.game.GamingConsole;

@Configuration
@ComponentScan("com.sag.game")
public class GamingAppLauncherApplication {
	


	public static void main(String[] args) {
		
		//created a simple springContext
		try(var context = 
				new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);){
		
		context.getBean(GameRunner.class).run();
		}
//spring is able to scan the package and find the components , create instances and auto-add them for us.

	}

}
