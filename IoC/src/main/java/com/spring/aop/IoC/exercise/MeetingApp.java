package com.spring.aop.IoC.exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HP on 2019-03-04.
 */
public class MeetingApp {
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Meeting meeting = context.getBean(Meeting.class);
        System.out.println(meeting);
    }

}
