package edu.shashin.oracledocs.java.lambdas;

/*
 * A functional interface is any interface that contains only one abstract
 * method. (A functional interface may contain one or more default methods or
 * static methods.)
 */
public interface CheckPerson {
	boolean test(Person p);

	static void aStaticMethod() {
		System.out.println("this is a static method");
	}

	default void aDefaultMethod() {
		System.out.println("this is a default method");
	}
	// boolean test2(); //violates functional interface rule
}
