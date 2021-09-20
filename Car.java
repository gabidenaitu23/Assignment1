package com.examle;

public abstract class Car {
    private FuelBehavior fuelBehavior;
    private SeatBehavior seatBehavior;

    public Car() {
        this(new Petrol(),new FourSeat());
    }
    public Car(FuelBehavior fuelBehavior, SeatBehavior seatBehavior) {
        this.fuelBehavior = fuelBehavior;
        this.seatBehavior = seatBehavior;
    }

    public Car(FuelBehavior fuelBehavior) {
        this(fuelBehavior,new FourSeat());
    }

    public void performUse(){
        this.fuelBehavior.use();
    }

    public void performRefuel(){
        this.fuelBehavior.refuel();
    }

    public void performSeat(){
        this.seatBehavior.seat();
    }

    public abstract void drive();
}
