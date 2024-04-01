package com.sag.a0spfwtightcoupled;

import com.sag.a0spfwtightcoupled.game.GameRunner;
import com.sag.a0spfwtightcoupled.game.SuperContraGame;

public class AppGameBasic {

	public static void main(String[] args) {
		
		//below to execute the specific game you need to make changes at 
		//GameRunner Class (which is called as the 
//		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner =  new GameRunner(superContraGame);
		gameRunner.run();
	}

}
