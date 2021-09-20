package com.examle;

public class Porsche911 extends Car{

    public Porsche911() {
        super(new Petrol(), new TwoSeat());
    }

    @Override
    public void drive() {
        System.out.println("sound of engine");
    }
}
