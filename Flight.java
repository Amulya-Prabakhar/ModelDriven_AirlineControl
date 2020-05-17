/*
File Name: Flight.java
Authors: Amulya Prabakhar, Bindu Reddy
*/

import java.util.*;
public class Flight {
	public Operation_manager operationManager;
	public ArrayList<Crew> crewList;
	public Airline airline;
	public Airport origin;
	public Airport destination;
	public int Flight_number;
	public int Departure_date;
	public int Arrival_date;
	public int Departure_time;
	public int Arrival_time;
	public int Actual_arrival_time;
	public int Actual_departure_time;
	public HashMap<Integer, Booking> bookings = new HashMap<Integer, Booking>();
	public Flight(int flight_number, Airport origin, Airport destination, int departure_date, int arrival_date,
			int departure_time, int arrival_time, int actual_arrival_time,
			int actual_departure_time, Operation_manager operationManager, ArrayList<Crew> crewList, Airline airline) {
		Flight_number = flight_number;
		this.origin = origin;
		this.destination = destination;
		Departure_date = departure_date;
		Arrival_date = arrival_date;
		Departure_time = departure_time;
		Arrival_time = arrival_time;
		Actual_arrival_time = actual_arrival_time;
		Actual_departure_time = actual_departure_time;
		this.operationManager = operationManager;
		this.crewList = crewList;
	}
	
	public int Delay_arrival(){
		return Actual_arrival_time-Arrival_time;

	}
	public int Delay_departure(){
		return Actual_departure_time-Departure_time;

	}
	public String addBooking(Booking b){
		if(bookings!=null){
			if(bookings.containsKey(b.SeatNumber)){
				return "Seat already booked";
			}
			else{
				bookings.put(b.SeatNumber, b);
				return "Seat booked successfully";
			}
		}
		else{
			bookings = new HashMap<Integer, Booking>();
			bookings.put(b.SeatNumber, b);
			return "Seat booked successfully";
		}
	}
	public String cancelBooking(Booking b){
		if(bookings!=null){
			if(bookings.containsKey(b.SeatNumber)){
				bookings.remove(b.SeatNumber);
				return "Booking cancelled";
			}
			else{
				return "Booking not found";
			}
		}
		else{
			return "No bookings have been made yet";
		}
	}
	public String cancelAllBookings(){
		bookings.clear();
		return "All bookings for this flight have been cancelled";
	}
}
