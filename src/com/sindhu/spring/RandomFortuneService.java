package com.sindhu.spring;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data = {
			"Diligence is the mother of good luck",
			"The journey of reward",
			"Set a Goal and achieve it!",
			"Work Hard to achieve your goal!"
	};
	
	//create a random number generator
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String myFortune = data[index];
		return myFortune;
	}

}
