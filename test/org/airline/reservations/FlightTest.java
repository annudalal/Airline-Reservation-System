package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlightTest {

	@Test
	public void testFlight() {
		Flight testFlight1 = new Flight();
		assertEquals("Unknown Departure City", testFlight1.getDepartureCity());
		assertEquals("Unknown Arrival City", testFlight1.getArrivalCity());
		assertEquals(100, testFlight1.getFlightNo());
	}
	@Test
   public void testsetDepartureCity() {
	   	Flight testFlight2 = new Flight();
	   	testFlight2.setDepartureCity("Los Angeles");
	   	assertEquals("Los Angeles", testFlight2.getDepartureCity());
	   	
}
	@Test
   public void testsetArrivalCity() {
	   	Flight testFlight3 = new Flight();
	   	testFlight3.setArrivalCity("SFO");
	   	assertEquals("SFO", testFlight3.getArrivalCity());
	   	
}
	@Test
   public void testsetFlightNo() {
	   	Flight testFlight4 = new Flight();
	   	testFlight4.setFlightNo(101);
	   	assertEquals(101, testFlight4.getFlightNo());
	   	
}
	@Test
	public void testFlight2() { //test second constructor
		Flight testFlight5 = new Flight(2000, "Chicago", "New York City");
		assertEquals(2000, testFlight5.getFlightNo());
		assertEquals("Chicago", testFlight5.getDepartureCity());
		assertEquals("New York City", testFlight5.getArrivalCity());

}
	@Test
public void testToString() {
	Flight testFlight6 = new Flight(2000, "Chicago", "New York City");
	assertEquals("Flight: 2000 Chicago - New York City", testFlight6.toString());
	
}
}
