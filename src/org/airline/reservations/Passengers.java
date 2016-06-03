package org.airline.reservations;

public class Passengers {
private String name;

//constructors
public Passengers(){
	name = "Unknown";
}
public  Passengers( String name) {
	setName(name);
}
//getters and setters
public String getName(){
	return name;
}
public void setName(String newName){
	name= newName;
}
//toString
public String toString() {
	return "Passenger: " + this.getName();
}
}
