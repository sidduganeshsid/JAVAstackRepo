package com.sag.a0spfwtightcoupled;

import com.sag.a0spfwtightcoupled.game.MarioGame;

public class AppGameBasic {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var gameRunner =  new GameRunner(marioGame);
		gameRunner.run();
	}

}
