package com.sag.a0spfwtightcoupled;

import com.sag.a0spfwtightcoupled.game.GameRunner;
import com.sag.a0spfwtightcoupled.game.MarioGame;
import com.sag.a0spfwtightcoupled.game.PacManGame;
import com.sag.a0spfwtightcoupled.game.SuperContraGame;

public class AppGameBasic {

	public static void main(String[] args) {
		
		//loosly coupled
		// var game = new MarioGame();
		// var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner =  new GameRunner(game);
		//2 : object creation + wiring of dependencies
		//game is a dependency of gamerunner

		
		gameRunner.run();
	}

}
