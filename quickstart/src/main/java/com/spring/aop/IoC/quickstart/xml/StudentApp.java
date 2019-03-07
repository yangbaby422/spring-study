package com.spring.aop.IoC.quickstart.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HP on 2019-02-25.
 */
public class StudentApp {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("/beans.xml");
        Student student=(Student)context.getBean("student");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getPhone().getBrand());
        System.out.println(student.getPhone().getPrice());
    }
}
