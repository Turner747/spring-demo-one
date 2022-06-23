package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {

        // load spring file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean
        RugbyCoach theCoach = context.getBean("myRugbyCoach", RugbyCoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());


        // close the context
        context.close();

    }


}
