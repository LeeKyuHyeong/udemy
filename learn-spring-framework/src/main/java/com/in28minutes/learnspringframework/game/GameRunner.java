package com.in28minutes.learnspringframework.game;

public class GameRunner {

	private MarioGame marioGame;
	
	public GameRunner(MarioGame marioGame) {
		this.marioGame = marioGame;
	}
	
	public void run() {
		System.out.println("run GameRunner");
	}
	
}
