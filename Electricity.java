package com.examle;

public class Electricity implements FuelBehavior{

    @Override
    public void refuel() {
        System.out.println("charge your battery");
    }

    @Override
    public void use() {
        System.out.println("discharge the battery");
    }
}
