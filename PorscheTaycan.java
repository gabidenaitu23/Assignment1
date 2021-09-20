package com.examle;

public class PorscheTaycan extends Car{

    public PorscheTaycan() {
        super(new Electricity(), new FourSeat());
    }

    @Override
    public void drive() {
        System.out.println("no sound");
    }
}
