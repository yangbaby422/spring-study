package com.spring.aop.IoC.exercise;

/**
 * Created by HP on 2019-03-04.
 */
public class User {
    private String account;
    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
