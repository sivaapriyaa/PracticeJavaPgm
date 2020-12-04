package com.myspring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*@Component
public class BasketBallCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	//@Autowired
	public BasketBallCoach(FortuneService theFortuneService){
		fortuneService=theFortuneService;
		
	}
	@Override
	public String getDailyWorkout() {
	
		return "You have morning practice at 6'0 clock";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}*/
