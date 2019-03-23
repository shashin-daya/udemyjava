package edu.shashin.udemy.java.section7.OOP_Part_1_Inheritance_Challenge_Part_1_plus_Challenge_Exercise_Source_code.src.com.timbuchalka;

/**
 * Created by dev on 8/3/15.
 */
public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Change to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed,direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
    }

}
