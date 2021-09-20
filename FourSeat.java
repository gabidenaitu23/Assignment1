package com.examle;

public class FourSeat implements SeatBehavior{
    @Override
    public void seat() {
        System.out.println("4 passengers available");
    }
}
