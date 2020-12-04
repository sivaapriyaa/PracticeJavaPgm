package com.myspring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemo {

	public static void main(String[] args) {
		//read the spring java config class
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from spring container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		//close the context
		context.close();
		

	}

}
