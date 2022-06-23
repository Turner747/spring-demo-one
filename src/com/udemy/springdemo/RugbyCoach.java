package com.udemy.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class RugbyCoach implements Coach, DisposableBean {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	
	public RugbyCoach(){

	}

	public RugbyCoach(FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}

	public void setFortuneService(FortuneService fS){
		fortuneService = fS;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getTeam() {
		return team;
	}

	public void initBean(){
		System.out.println("In the initBean method");
	}

	public void destBean(){
		System.out.println("In the destBean method");
	}

	@Override
	public String getDailyWorkout() {
		
		return "Do 50 suicides";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("In the destroy method");
	}
}
