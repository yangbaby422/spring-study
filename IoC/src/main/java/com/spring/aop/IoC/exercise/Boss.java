package com.spring.aop.IoC.exercise;

import java.util.List;

/**
 * Created by HP on 2019-03-04.
 */
public class Boss {
    private String name;
    private String commpany;
    private Car car;
    private List<String> hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommpany() {
        return commpany;
    }

    public void setCommpany(String commpany) {
        this.commpany = commpany;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Boss() {

    }

    public Boss(String name, String commpany, Car car, List<String> hobbies) {
        this.name = name;
        this.commpany = commpany;
        this.car = car;
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", commpany='" + commpany + '\'' +
                ", car=" + car +
                ", hobbies=" + hobbies +
                '}';
    }
}
