package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {
	
	public HappyFortuneService() {
		System.out.println("HappyFortuneServie: inside contructor");
	}

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
