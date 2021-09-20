package com.examle;

public class TwoSeat implements SeatBehavior{

    @Override
    public void seat() {
        System.out.println("2 passengers available");
    }
}
