package com.myspring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	//Define default constructor
	public TennisCoach() {
		System.out.println("Inside Tennis coach Default Constructor");
	}
	
	//define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach-----Inside my doMyStartupStuff");
	}
	
	//define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("TennisCoach-----Inside my doMyCleanupStuff ");
	}
	
	/*
	 * //Define Setter Method
	 * 
	 * @Autowired public void setFortuneService(FortuneService theFortuneService) {
	 * System.out.println("Inside setter method @Autowired"); fortuneService =
	 * theFortuneService; }
	 * 
	 * //Any method
	 * 
	 * @Autowired public void myCustomMethod(FortuneService theFortuneService) {
	 * System.out.println("Inside myCustomMethod @Autowired"); fortuneService =
	 * theFortuneService; }
	 */


	@Override
	public String getDailyWorkout() {
	return "Default bean id:Work harder!";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
