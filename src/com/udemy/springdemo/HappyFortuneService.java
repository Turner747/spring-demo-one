package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		// load spring file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		ArrayList<String> fortunes = context.getBean("fortuneList", ArrayList.class);

		Random rand = new Random();
		int maxValue = 3;

		return (String) fortunes.get(rand.nextInt(maxValue));
	}

}
