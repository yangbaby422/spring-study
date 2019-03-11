package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
        Tiger tiger = context.getBean(Tiger.class);
        tiger.walk();
    }
}
