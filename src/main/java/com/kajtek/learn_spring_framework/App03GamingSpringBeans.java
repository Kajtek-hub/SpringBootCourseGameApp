package com.kajtek.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kajtek.learn_spring_framework.game.GameRunner;
import com.kajtek.learn_spring_framework.game.GamingConsole;
import com.kajtek.learn_spring_framework.game.MarioGame;
import com.kajtek.learn_spring_framework.game.SuperContraGame;
import com.kajtek.learn_spring_framework.game.PacmanGame;



@Configuration
@ComponentScan("com.kajtek.learn_spring_framework.game")
public class App03GamingSpringBeans {
	

	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		System.out.println("Parameter: "+ game);
		var gameRunner = new GameRunner(game);
		return gameRunner;
		}
	

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		
		
		
	}

}
