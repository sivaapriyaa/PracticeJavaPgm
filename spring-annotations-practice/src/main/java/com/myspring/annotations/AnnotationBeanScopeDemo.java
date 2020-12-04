package com.myspring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		//Load the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		//Check if they are same
		boolean result=(theCoach == alphaCoach);
		//Print the details
		System.out.println("Pointing to Same object: "+result);
		System.out.println("Memory Location for theCoach: "+theCoach);
		System.out.println("Memory Location for alphaCoach: "+alphaCoach);
		context.close();


	}

}
