package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class PassengersTest {

	@Test
	public void testPassengers() {
		Passengers testPassenger1 = new Passengers();
		String result = testPassenger1.getName();
		assertEquals("Unknown", result );
		
	}

	@Test
	public void testSetName() {
		Passengers testPassenger2 = new Passengers();
		testPassenger2.setName("Annu Dalal");
		assertEquals("Annu Dalal", testPassenger2.getName() );
	}
	@Test
public void testPassengers2() {
	Passengers testPassenger3 = new Passengers("Annu Dalal");
	assertEquals("Annu Dalal", testPassenger3.getName());
}
	@Test
	public void testToString() {
		Passengers testPassenger4=new Passengers("Annu Dalal");
		assertEquals("Passenger: Annu Dalal", testPassenger4.toString());
	}
}

