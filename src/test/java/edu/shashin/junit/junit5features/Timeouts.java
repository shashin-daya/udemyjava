package edu.shashin.junit.junit5features;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * source: https://www.baeldung.com/junit-5-migration
 *
 */
public class Timeouts {

	/*
	 * JUnit4
	 * @Test(timeout = 1) public void shouldFailBecauseTimeout() throws
	 * InterruptedException { Thread.sleep(10); }
	 */

	@Test
	public void shouldFailBecauseTimeout2() throws InterruptedException {
		Assertions.assertTimeout(Duration.ofMillis(1), () -> Thread.sleep(10));
	}
}
