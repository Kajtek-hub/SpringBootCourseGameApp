package com.kajtek.learn_spring_framework;

import com.kajtek.learn_spring_framework.game.GameRunner;
import com.kajtek.learn_spring_framework.game.MarioGame;
import com.kajtek.learn_spring_framework.game.SuperContraGame;
import com.kajtek.learn_spring_framework.game.PacmanGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();	//1. Tworzymy obiekt
		var gameRunner = new GameRunner(game); //Wstrzykujemy obiekt w klasę gameRunner
		// "game" jest zależnością (dependency) klasy "GameRunner", czyli to jest to tzw. Dependency Injection - wstrzykiwanie zależności 
		gameRunner.run();

	}

}
