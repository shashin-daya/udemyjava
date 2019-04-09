package edu.shashin.oracledocs.java.defaultmethod;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class TimeClientImpl implements TimeClient {

	@Override
	public void setTime(int hour, int minute, int second) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDate(int day, int month, int year) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDateAndTime(int day, int month, int year, int hour, int minute, int second) {
		// TODO Auto-generated method stub

	}

	@Override
	public LocalDateTime getLocalDateTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ZonedDateTime getZonedDateTime(String zoneString) {
		System.out.println("Static method of impl called");
		return ZonedDateTime.of(getLocalDateTime(), TimeClient.getZoneId(zoneString));
	}

}
