package com.spring.aop;

public class MoveApp {
    public static void main(String[] args) {
        Move tank = new Tank();
        Move car = new Car();
        TankProxy tankProxy = new TankProxy(tank);
        tankProxy.move();
    }
}
