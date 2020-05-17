/*
File Name: Booking.java
Authors: Amulya Prabakhar, Bindu Reddy
*/

import java.util.*;
public class Booking {
	public int SeatNumber;
	public Flight flight;
	public ArrayList<Passenger> passengers;
	public Booking(int seatNumber, Flight flight, ArrayList<Passenger> passengers) {
		SeatNumber = seatNumber;
		this.flight = flight;
		this.passengers=passengers;
	}
}
