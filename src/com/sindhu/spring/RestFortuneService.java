package com.sindhu.spring;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is Rest FortuneService!";
	}

}
