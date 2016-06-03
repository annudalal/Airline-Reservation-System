package org.airline.reservations;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class TicketsTest {

	@Test
	public void testSetPassenger() {
		Tickets testTicket1 = new Tickets();
		Passengers testPassenger1 = new Passengers("Mike Kelly");
		testTicket1.setPassenger(testPassenger1);
		assertEquals("Mike Kelly", testTicket1.getPassenger().getName());
	}
	
	@Test
	public void testSetSeat() {
		Tickets testTicket2 = new Tickets();
		Seat testSeat2 = new Seat(2);
		testTicket2.setSeat(testSeat2);
		assertEquals(2, testTicket2.getSeat().getSeatNo());
	}
	
	@Test
	public void testSetFlight() {
		Tickets testTicket3 = new Tickets();
		Flight testFlight3 = new Flight(3000, "Los Angeles", "Chicago");
		testTicket3.setFlight(testFlight3);
		assertEquals(3000, testTicket3.getFlight().getFlightNo());
	}
	
	@Test
	public void testToString() {
		Tickets testTicket4 = new Tickets();
		Passengers testPassenger4 = new Passengers("Mike Kelly");
		Seat testSeat4 = new Seat(4);
		Flight testFlight4 = new Flight(4000, "Los Angeles", "Chicago");
		testTicket4.setPassenger(testPassenger4);
		testTicket4.setSeat(testSeat4);
		testTicket4.setFlight(testFlight4);
		assertEquals("Ticket: Mike Kelly departing on flight 4000 from Los Angeles to Chicago on " + LocalDate.now() + " in seat 4", testTicket4.toString());
		
	}

}
