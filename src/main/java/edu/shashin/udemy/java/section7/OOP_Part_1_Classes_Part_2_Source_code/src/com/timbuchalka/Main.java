package edu.shashin.udemy.java.section7.OOP_Part_1_Classes_Part_2_Source_code.src.com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
