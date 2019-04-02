package edu.shashin.junit.junit5features;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class JUnitAssumptions {

	@Test
	public void whenEnvironmentIsWeb_thenUrlsShouldStartWithHttp() {
		Assumptions.assumingThat("WEB".equals(System.getenv("ENV")), () -> {
			Assertions.assertTrue("y".startsWith("x")); // Does not come inside
		});
	}
}
