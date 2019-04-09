package edu.shashin.oracledocs.java.defaultmethod;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
 * A functional interface is any interface that contains only one abstract
 * method. (A functional interface may contain one or more default methods or
 * static methods.) Because a functional interface contains only one abstract
 * method, you can omit the name of that method when you implement it.
 */
public interface TimeClient {
	void setTime(int hour, int minute, int second);

	void setDate(int day, int month, int year);

	void setDateAndTime(int day, int month, int year, int hour, int minute, int second);

	LocalDateTime getLocalDateTime();

	// Can change visibility. Public by default. Cannot be overridden
	static ZoneId getZoneId(String zoneString) {
		try {
			return ZoneId.of(zoneString);
		} catch (DateTimeException e) {
			System.err.println("Invalid time zone: " + zoneString + "; using default time zone instead.");
			return ZoneId.systemDefault();
		}
	}

	// Visibility can be public only. can be overridden
	default ZonedDateTime getZonedDateTime(String zoneString) {
		return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
	}
}
