package com.udemy.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {
	
	FortuneService fortuneService;
	

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartUpStuff(){
		System.out.println("start up method");
	}

	// add a destroy method
	public void doMyCleamUpStuff(){
		System.out.println("clean up method");
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method");
	}
}
