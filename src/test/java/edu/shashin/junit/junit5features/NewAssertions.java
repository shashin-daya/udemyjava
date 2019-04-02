package edu.shashin.junit.junit5features;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * source: https://www.baeldung.com/junit-5-migration
 *
 */
public class NewAssertions {

	@Test
	public void shouldFailBecauseTheNumbersAreNotEqual_lazyEvaluation() {
		Assertions.assertTrue(2 == 3, () -> "Numbers " + 2 + " and " + 3 + " are not equal!");
	}

	@Test
	public void shouldAssertAllTheGroup() {
		List<Integer> list = Arrays.asList(1, 2, 4);
		Assertions.assertAll("List is not incremental", () -> Assertions.assertEquals(list.get(0).intValue(), 1),
				() -> Assertions.assertEquals(list.get(1).intValue(), 2),
				() -> Assertions.assertEquals(list.get(2).intValue(), 3));
	}

}
