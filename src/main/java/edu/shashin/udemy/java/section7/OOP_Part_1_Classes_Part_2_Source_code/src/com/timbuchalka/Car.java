package edu.shashin.udemy.java.section7.OOP_Part_1_Classes_Part_2_Source_code.src.com.timbuchalka;

/**
 * Created by dev on 8/3/15.
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
