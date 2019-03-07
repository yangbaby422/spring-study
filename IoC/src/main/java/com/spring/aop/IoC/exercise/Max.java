package com.spring.aop.IoC.exercise;

/**
 * Created by HP on 2019-03-04.
 */
public class Max {
    private int a;
    private int b;

    public Max(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getMax(){
        return a > b ? a : b;
    }
}
