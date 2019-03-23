package edu.shashin.udemy.java.section7.OOP_Part_1_Inheritance_Challenge_Part_1_plus_Challenge_Exercise_Source_code.src.com.timbuchalka;

/**
 * Created by dev on 8/3/15.
 */
public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
