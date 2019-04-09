package edu.shashin.oracledocs.java.lambdas;

import java.time.LocalDate;
import java.time.Period;

/*
 * source:
 * https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
 */public class Person {
	public enum Sex {
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	public int getAge() {
		Period period = Period.between(LocalDate.now(), birthday);
		return period.getDays();
	}

	public void printPerson() {
		System.out.println("Print person. Name: " + name);
	}

	public Sex getGender() {
		return gender;
	}
}
