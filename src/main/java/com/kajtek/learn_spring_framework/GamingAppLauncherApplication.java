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
public class GamingAppLauncherApplication {

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		
		
		
	}

}
