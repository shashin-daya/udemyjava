package edu.shashin.oracledocs.java.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

// source:
// https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
public class AFunctionalInterfaceTest {

	@Test
	public void testFunctionalInterface() {
		List<Person> roster = new ArrayList<>();
		printPersonsOlderThan(roster, 30);
		printPersonsWithinAgeRange(roster, 25, 35);
		printPersons(roster, new CheckPersonEligibleForSelectiveService());
		printPersons(roster, new CheckPerson() {
			@Override
			public boolean test(Person p) {
				return p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
			}
		});
		printPersons(roster, (Person p) -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);
		printPersonsWithPredicate(roster,
				p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);
	}

	private void printPersonsOlderThan(List<Person> roster, int age) {
		for (Person p : roster) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}
	}

	private void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
		for (Person p : roster) {
			if (low <= p.getAge() && p.getAge() < high) {
				p.printPerson();
			}
		}
	}

	private void printPersons(List<Person> roster, CheckPerson tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}

	private void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}
}
