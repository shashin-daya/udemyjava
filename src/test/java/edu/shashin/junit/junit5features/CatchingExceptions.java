package edu.shashin.junit.junit5features;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatchingExceptions {

	// Expected parameter is not supported
	// @Test(expected = Exception.class)
	@Test
	public void shouldRaiseAnException() throws Exception {
		Assertions.assertThrows(NumberFormatException.class, () -> {
			// throw new IllegalArgumentException("Wrong exception");
			throw new NumberFormatException("Testing exception");
		});
	}

}
