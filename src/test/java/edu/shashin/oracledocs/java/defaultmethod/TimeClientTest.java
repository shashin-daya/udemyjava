package edu.shashin.oracledocs.java.defaultmethod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TimeClientTest {
	@Test
	@DisplayName("Test Static method is public")
	public void testStaticInterfaceMethod() {
		TimeClient.getZoneId("Asia/Kolkata"); // Static method is public by default
	}

	@Test
	@DisplayName("Test default method")
	public void testDefaultInterfaceMethod() {
		TimeClient timeClient = new TimeClientImpl();
		timeClient.getZonedDateTime("Asia/Kolkata");
	}

}
