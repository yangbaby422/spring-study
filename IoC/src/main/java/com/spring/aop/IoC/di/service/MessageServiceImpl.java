package com.spring.aop.IoC.di.service;

/**
 * Created by HP on 2019-03-04.
 */
public class MessageServiceImpl implements MessageService{
    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public MessageServiceImpl() {

    }
    public MessageServiceImpl(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getMessage() {
        return "Hello World" + username + ",age is " + age;
    }
}
