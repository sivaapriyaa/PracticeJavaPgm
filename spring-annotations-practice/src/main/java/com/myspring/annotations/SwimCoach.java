package com.myspring.annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	@Value("{foo.email}")
	private String email;
	@Value("{foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Swimming is the best exercise";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}