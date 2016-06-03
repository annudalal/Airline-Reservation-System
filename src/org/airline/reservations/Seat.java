package org.airline.reservations;

public class Seat {
private int seatNo;

//Constructors
public  Seat() {
	seatNo=0;
}
public Seat(int seatNo){
	setSeatNo(seatNo);
}
//toString
public String toString() {
	return "Seat: " + this.getSeatNo();
}


//getters and setters
public int getSeatNo() {
	// TODO Auto-generated method stub
	return seatNo;
}
public void setSeatNo(int seatNo) {
	// TODO Auto-generated method stub
	this.seatNo= seatNo;
}

}
