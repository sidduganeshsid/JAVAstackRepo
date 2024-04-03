package com.sag.a0spfwtightcoupled.game;

import org.springframework.stereotype.Component;

//component tells the spring to create the instance
@Component
public class PacManGame implements GamingConsole{
	public void up() {
		System.out.println("move up");
		
	}
	public void down() {
		System.out.println("move down");
		
	}
	public void left() {
		System.out.println("move left");
		
	}
	public void right() {
		System.out.println("movie right");
		
	}

}
