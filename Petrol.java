package com.examle;

public class Petrol implements FuelBehavior{

    @Override
    public void refuel() {
        System.out.println("fill in");
    }

    @Override
    public void use() {
        System.out.println("burning out");
    }
}
