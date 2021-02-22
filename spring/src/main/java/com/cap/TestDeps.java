package com.cap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDeps {

	public static void main(String[] args) {
//		B b = new B();
//		A a = new A(b);
		// spring specific code 
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// get instance from spring
		A a = context.getBean(A.class);
		
		a.execute();
		
		System.out.println(" _ ___ __------- ___ __ _");
		
		WorkoutRepository  workoutRepository = context.getBean(WorkoutRepository.class);
		workoutRepository.assignWorkoutToUser();
		
//		b = new B1();
//		a = new A(b);
//		a.execute();
	}

}
