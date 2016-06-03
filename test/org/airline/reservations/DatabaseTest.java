package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class DatabaseTest {

	@Test
	public void testDB() {
		Database testDB = new Database();
		assertEquals(0, testDB.getSeats().size());
		assertEquals(0, testDB.getPassengers().size());
		assertEquals(0, testDB.getFlight().size());
		assertEquals(0, testDB.getTicket().size());
	}
	@Test
	public void testAddSeat() {
		Database testDB2 = new Database();
		testDB2.addSeat(2);
		assertEquals(1, testDB2.getSeats().size());
		assertEquals(2, testDB2.getSeats().get(0).getSeatNo());
	}
	@Test
	public void testAddPassenger() {
		Database testDB3 = new Database();
		testDB3.addPassenger("Annu Dalal");
		assertEquals(1, testDB3.getPassengers().size());
		assertEquals("Annu Dalal", testDB3.getPassengers().get(0).getName());
}
	@Test
	public void testAddNewPassenger() {
		Database testDB6 = new Database();
		boolean result1 = testDB6.addPassenger("Annu Dalal");
		assertEquals(false, result1);
		boolean result2 = testDB6.addPassenger("Annu Dalal");
		assertEquals(true, result2);
}
	
	
	@Test
	public void testAddFlight() {
		Database testDB4 = new Database();
		testDB4.addFlight(100, "Chicago", "Los Angeles");
        assertEquals(1, testDB4.getFlight().size());
        assertEquals("Chicago", testDB4.getFlight().get(0).getDepartureCity());
        assertEquals("Los Angeles", testDB4.getFlight().get(0).getArrivalCity());
        		
        		
	}
	
	
	
	@Test
	public void testBootstrap() {
		Database testDB5 = new Database();
		testDB5.bootstrap();
		assertEquals(6, testDB5.getSeats().size());
		assertEquals(4, testDB5.getFlight().size());
	}
}
