package com.in28minutes.learnspringframework.game;

public class AppGamingBasic {
	
	public static void main(String[] args) {
		
		MarioGame marioGame = new MarioGame();
		
		GameRunner gameRunner = new GameRunner(marioGame);
		
		gameRunner.run();
	}
}
