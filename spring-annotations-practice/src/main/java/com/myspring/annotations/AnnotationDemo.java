package com.myspring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		//read the spring config
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
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
