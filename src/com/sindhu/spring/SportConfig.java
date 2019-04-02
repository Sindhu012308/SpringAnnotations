package com.sindhu.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.sindhu.spring")
@PropertySource("/sport.properties")
public class SportConfig {

	//Define bean for our sad fortune service
	//Bean id: sadFortuneService()
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
			
	// define bean for our swim coach and inject dependency
	//Bean ID: swimCoach
	@Bean
	public Coach swimCoach(){
		return new SwimCoach(sadFortuneService());
	}

}
