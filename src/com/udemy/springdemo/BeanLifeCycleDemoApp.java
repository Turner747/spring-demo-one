package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {

        // load config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve bean
        Coach theCoach = context.getBean("myCoach", Coach.class);

        MyCustomBeanProcessor processor = context.getBean("customProcessor", MyCustomBeanProcessor.class);

        // print results
        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();

    }

}
