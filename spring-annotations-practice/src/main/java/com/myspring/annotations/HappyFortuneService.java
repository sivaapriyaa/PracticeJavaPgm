package com.myspring.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {


	@Override
	public String getFortune() {
		
		return "You are doing good job";
	}

}
