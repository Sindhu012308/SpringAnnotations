package com.sindhu.spring;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is Database FortuneService";
	}

}
