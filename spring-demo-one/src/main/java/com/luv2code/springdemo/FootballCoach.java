package com.luv2code.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	public FootballCoach() {
		System.out.println("FootballCoach: inside Constructor");
	}
	

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("FootballCoach: inside setFortuneServie for Dependence Injection.");
	}

	@Override
	public String getDailyWorkout() {
		return "Kick football 100 times!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartupStuff() {
		System.out.println("FootballCoach: inside method doMyStarupStuff");
	}

	// add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("FootballCoach: inside method doMyCleanupStuffYoYo");
	}

}
