package edu.shashin.udemy.java.section7.OOP_Part_1_Inheritance_Part_2_Source_code.src.com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
//        dog.eat();
        dog.walk();
//        dog.run();

    }
}