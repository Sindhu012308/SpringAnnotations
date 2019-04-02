package com.sindhu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean from spring container
		SwimCoach thecoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call a method on bean
		System.out.println(thecoach.getDailyWorkout());
		
		System.out.println(thecoach.getDailyFortune());
		
		System.out.println("Email Address: "+thecoach.getEmailAddress());
		
		System.out.println("Team :"+thecoach.getTeam());
		//close the context
		context.close();
	}
}
