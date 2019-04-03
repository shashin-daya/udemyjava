package edu.shashin.oracledocs.java.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingAndUnboxing {

	public static void main(String[] args) {
		List<Long> li = new ArrayList<>();
		for (long i = 1; i < 50; i += 2)
			li.add(i); // Autobox

		// for (int i = 1; i < 50; i += 2)
		// li.add(i); // int cannot be Autoboxed to Long
		Long longObject;
		int i = 10;
		long l = 10;
		l = i;
		// i=l;//Error
		// lObject=i; // int cannot be Autoboxed to Long
		longObject = l;
		// i=lObject;// Long cannot be Unboxed to int

		Integer intObject;
		intObject = i;
		// iObject=lObject;// Long cannot be Unboxed to Integer
		// lObject = iObject;// Integer cannot be Autoboxed to Long

		AutoBoxingAndUnboxing testClass = new AutoBoxingAndUnboxing();
		testClass.testAutoBoxMethod(10); // Primitive call else Integer else Object
		testClass.testAutoBoxMethod((short) 10); // Primitive int call else Object
		testClass.testAutoBoxMethod((long) 10); // Object call only
		testClass.testAutoBoxMethod(Integer.valueOf(10)); // Integer call else Object
		testClass.testAutoBoxMethod(Long.valueOf(10)); // Object call only
		testClass.testAutoBoxMethod(Short.valueOf((short) 10)); // Object call if exists. else primitive call

		/*
		 * Cross conversion doesn't happen between objects, i.e Short is not converted
		 * to Integer, primitive short is not converted to Integer etc while short is
		 * auto converted to int
		 */
	}

	private void testAutoBoxMethod(int x) {
		System.out.println("primitive parameter");
	}

	private void testAutoBoxMethod(Integer x) {
		System.out.println("non primitive parameter");
	}

	private void testAutoBoxMethod(Object x) {
		System.out.println("Object parameter");
	}

}
