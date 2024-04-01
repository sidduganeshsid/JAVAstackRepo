package com.sag.a0spfwtightcoupled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sag.a0spfwtightcoupled.game.GameRunner;
import com.sag.a0spfwtightcoupled.game.GamingConsole;
import com.sag.a0spfwtightcoupled.game.MarioGame;
import com.sag.a0spfwtightcoupled.game.PacManGame;
import com.sag.a0spfwtightcoupled.game.SuperContraGame;

public class App03GameBasic {

	public static void main(String[] args) {
		
		//created a simple springContext
		try(var context = 
				new AnnotationConfigApplicationContext(GamingConfiguration.class);){
		
		
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
		}
		
//		//loosly coupled
//		// var game = new MarioGame();
//		// var game = new SuperContraGame();
//		var game = new PacManGame();
//		var gameRunner =  new GameRunner(game);
//		//2 : object creation + wiring of dependencies
//		//game is a dependency of gamerunner
//
//		
//		gameRunner.run();
	}

}
