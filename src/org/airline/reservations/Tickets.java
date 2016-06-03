package org.airline.reservations;

import java.time.LocalDate;

public class Tickets {
private LocalDate departureDate;
private Flight flight;
private Passengers passenger;
private Seat seat;

//constructor
public  Tickets() {
	departureDate= LocalDate.now();
	
}


//getters and setters
public LocalDate getDepartureDate() {
	return departureDate;
}
public void setDepartureDate(LocalDate departureDate) {
	this.departureDate = departureDate;
}
public Flight getFlight() {
	return flight;
}
public void setFlight(Flight flight) {
	this.flight = flight;
}
public Passengers getPassenger() {
	return passenger;
}
public void setPassenger(Passengers passenger) {
	this.passenger = passenger;
}
public Seat getSeat() {
	return seat;
}
public void setSeat(Seat seat) {
	this.seat = seat;
}
public String toString() {
	return "Ticket: " + this.getPassenger().getName() + " departing on flight " + this.getFlight().getFlightNo() + " from " + this.getFlight().getDepartureCity() + " to " + this.getFlight().getArrivalCity() + " on " + this.getDepartureDate() + " in seat " + this.getSeat().getSeatNo();
}
}
