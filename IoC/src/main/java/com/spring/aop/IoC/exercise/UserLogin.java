package com.spring.aop.IoC.exercise;

/**
 * Created by HP on 2019-03-04.
 */
public class UserLogin {
    private User user;

    public UserLogin() {
    }



    public UserLogin(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "UserLogin{" +
                "user=" + user +
                '}';
    }
    public  boolean userLogin(User user){
        if(user.getAccount().equals("admin") && user.getPassword().equals("123")){
            return true;
        }else {
            return false;
        }
    }


    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
