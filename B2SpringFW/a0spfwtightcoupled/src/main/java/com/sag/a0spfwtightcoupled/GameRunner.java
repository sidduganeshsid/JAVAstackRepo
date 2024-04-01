package com.sag.a0spfwtightcoupled;

import com.sag.a0spfwtightcoupled.game.MarioGame;

public class GameRunner {
	
	MarioGame game;
	
	GameRunner(MarioGame game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println("Running game : "+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
