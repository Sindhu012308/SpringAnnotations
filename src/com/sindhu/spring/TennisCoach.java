package com.sindhu.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
//Default Scope -- Singleton Scope
@Scope("singleton")
//@Scope("prototype")
public class TennisCoach implements Coach {
	//Field Injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Inside the default constructor of TennisCoach");
	}
	
	/*
	//Setter Injection
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the Setter Injection Method");
		this.fortuneService = fortuneService;
	}
	*/

	/*
	//Constructor Injection
	@Autowired
	public TennisCoach(FortuneService myfortuneService) {
		System.out.println("Inside the Constructor Injection Method");		
		fortuneService = myfortuneService;
	}
	*/
	
	/*
	//Method Injection
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("Inside the Method Injection - doSomeCrazyStuff()");
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice daily! Practice makes you perfect!";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//define my init method
	@PostConstruct
	public void doMyStratupStuff() {
		System.out.println(" TennisCoach: Inside my doMyStartupStuff() method");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(" TennisCoach: Inside my doMyCleanupStuff() method");
	}

}
