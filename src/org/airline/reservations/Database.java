package org.airline.reservations;

import java.time.LocalDate;
import java.util.ArrayList;

public class Database {

	private ArrayList<Seat> seats;
	private ArrayList<Passengers> passengers;
	private ArrayList<Flight> flight;
	private ArrayList<Tickets> ticket;
	
	//constructor
	public Database() {
		seats=new ArrayList<Seat>();
		passengers=new ArrayList<Passengers>();
		flight=new ArrayList<Flight>();
		ticket=new ArrayList<Tickets>();
		
	}
	
//getters and setters

	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public ArrayList<Passengers> getPassengers() {
		// TODO Auto-generated method stub
		return passengers;
	}

	public ArrayList<Flight> getFlight() {
		// TODO Auto-generated method stub
		return flight;
	}

	public ArrayList<Tickets> getTicket() {
		// TODO Auto-generated method stub
		return ticket;
	}

	public void addSeat(int seatNumber) {
	
		seats.add(new Seat(seatNumber));
	}

	public void addFlight(int flightNo, String departureCity, String arrivalCity) {
		flight.add(new Flight(flightNo, departureCity, arrivalCity));
		
	}

	public boolean addPassenger(String passengerName) {
		boolean passengerExists = false;
		
		for (Passengers item : getPassengers())
		{
			if(passengerName.equals(item.getName())){
				passengerExists = true;
		}
             
		}
		if(passengerExists==false){
			passengers.add(new Passengers(passengerName));
		}
		  return passengerExists;
	}
	
	public String addTicket(LocalDate departureDate, String passengerName, int flightNumber, int seatNumber)
	{
		//find the passenger object
		Passengers ticketPassenger = null;
		for(Passengers item: getPassengers())
		{
			if(passengerName.equals(item.getName())){
				ticketPassenger = item;
			}
		}
		// Find the flight object
		Flight ticketFlight = null;
		for(Flight item: getFlight())
		{
			if(flightNumber == item.getFlightNo()){
				ticketFlight= item;
			}
		}
		
		// Find the seat object
				Seat ticketSeat = null;
				for(Seat item: getSeats())
				{
					if(seatNumber == item.getSeatNo()){
						ticketSeat= item;
					}
				}
		// combining information on ticket object 
		Tickets 	tmpTicket = new Tickets();
		tmpTicket.setDepartureDate(departureDate);
		tmpTicket.setPassenger(ticketPassenger);
		tmpTicket.setFlight(ticketFlight);
		tmpTicket.setSeat(ticketSeat);
		
		//adding ticket object to Ticket arraylist
		ticket.add(tmpTicket);
		return tmpTicket.toString();
	}
	
	//Finding out available seats for a particular date and flight no
	public ArrayList<Seat> getOpenSeats( LocalDate departureDate, int flightNumber ){
		ArrayList<Seat> openSeats = getSeats();
		for(Tickets item: getTicket()){
			if(departureDate.equals(item.getDepartureDate()) && flightNumber == item.getFlight().getFlightNo()){
				openSeats.remove(item.getSeat());
			}
	   }
       return openSeats;
	}
	
	//Bootstrap method to add fix data
	public void bootstrap() {
		addSeat(1);
		addSeat(2);
		addSeat(3);
		addSeat(4);
		addSeat(5);
		addSeat(6);
		addFlight(1000, "Los Angeles", "Chicago");	
		addFlight(1001, "Chicago", "New York");	
		addFlight(2000, "New York", "Chicago");	
		addFlight(2001, "Chicago", "Los Angeles");	
	}

}
