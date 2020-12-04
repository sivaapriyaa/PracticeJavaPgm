package com.myspring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemo {

	public static void main(String[] args) {
		//read the spring java config class
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from spring container
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//Call new methods Swim coach has property value injected
		System.out.println("Email: "+theCoach.getEmail());
		System.out.println("Team: "+theCoach.getTeam());
		//close the context
		context.close();
		

	}

}
