package com.sindhu.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//get the bean from spring container
		//Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach theCoach1 = context.getBean("tennisCoach", Coach.class);
		
		Coach theCoach2 = context.getBean("tennisCoach", Coach.class);
		 	
		//call a method on that bean
		Boolean value = (theCoach1 == theCoach2);
		
		System.out.println("\nBoolean Result = "+ value);
	
		System.out.println("\nMemory location for Coach1 = "+ theCoach1);
		
		System.out.println("\nMemory location for Coach2 = "+ theCoach2);
		
		//cloase the context
		context.close();
				
	}

}
