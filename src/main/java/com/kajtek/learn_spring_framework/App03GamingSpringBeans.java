package com.kajtek.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kajtek.learn_spring_framework.game.GameRunner;
import com.kajtek.learn_spring_framework.game.GamingConsole;
import com.kajtek.learn_spring_framework.game.MarioGame;
import com.kajtek.learn_spring_framework.game.SuperContraGame;
import com.kajtek.learn_spring_framework.game.PacmanGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		
		
		
	}

}
