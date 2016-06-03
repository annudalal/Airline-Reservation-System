package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeatTest {

	@Test
	public void testSeat() {
		Seat testSeat1 = new Seat();
		assertEquals(0,testSeat1.getSeatNo());
	}
	
	@Test
	public void testSetSeatNumber() {
		Seat testSeat2 = new Seat();
		testSeat2.setSeatNo(2);
		assertEquals(2,testSeat2.getSeatNo());
	}
	
	@Test
	public void testSeat2() { //test second constructor
		Seat testSeat3 = new Seat(3);
		assertEquals(3, testSeat3.getSeatNo());
	}
	
	@Test
	public void testToString() {
		Seat testSeat4 = new Seat(4);
		assertEquals("Seat: 4", testSeat4.toString());
	}

}
