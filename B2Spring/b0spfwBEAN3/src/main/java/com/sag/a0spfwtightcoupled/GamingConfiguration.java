package com.sag.a0spfwtightcoupled;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sag.a0spfwtightcoupled.game.GameRunner;
import com.sag.a0spfwtightcoupled.game.GamingConsole;
import com.sag.a0spfwtightcoupled.game.PacManGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
//game and gameRunner are the springBeans
	//picking from spring context and executing the beans.
}
