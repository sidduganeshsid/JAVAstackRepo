package com.sag.a0spfwtightcoupled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sag.a0spfwtightcoupled.game.GameRunner;
import com.sag.a0spfwtightcoupled.game.GamingConsole;

@Configuration
@ComponentScan("com.sag.a0spfwtightcoupled.game")
public class App03GameBasic {
	
		//remove it after adding the @Component
//		@Bean
//		public GamingConsole game() {
//			var game = new PacManGame();
//			return game;
//		}
		
		@Bean
		public GameRunner gameRunner(GamingConsole game) {
			System.out.println("parameter "+game);
			var gameRunner = new GameRunner(game);
			
			return gameRunner;
		}

	public static void main(String[] args) {
		
		//created a simple springContext
		try(var context = 
				new AnnotationConfigApplicationContext(App03GameBasic.class);){
		
		
//		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
		}
		

	}

}
