/*
File Name: TestClass.java
Authors: Amulya Prabakhar, Bindu Reddy
*/

import java.util.*;
public class TestClass {

	public static void main(String[] args) {
		
		Operation_manager om = new Operation_manager("Bindu", "Montreal", "abcd", 1234, "operation manager");
		Crew c1 = new Crew("bhargav", "Tirupathi", "efgh", 9874, "pilot");
		Crew c2 = new Crew("kunal", "Kolkata", "efgh", 9874, "air host");
		ArrayList<Crew> crew = new ArrayList<Crew>();
		crew.add(c1);
		crew.add(c2);
		Airport origin = new Airport("Bangalore");
		Airport destination = new Airport("Singapore");
		Airline airline=new Airline("Reddy");
		Flight f1= new Flight(1345, origin, 
				destination, 20200219, 20200220, 
				1430, 1730, 1435, 1735, om, crew, airline);
		Passenger p1=new Passenger("Manya", "Hosur", "manyareddy", 12345, 9999);
		Passenger p2=new Passenger("Amulya", "Montreal", "abcd", 12345, 9999);
		ArrayList<Passenger> passenger = new ArrayList<Passenger>();
		passenger.add(p1);
		passenger.add(p2);
        Booking b1=new Booking(123, f1, passenger);
        Booking b2=new Booking(124, f1, passenger);
        System.out.println(f1.addBooking(b1));
        System.out.println(f1.addBooking(b2));
        //System.out.println(f1.cancelBooking(b1));
        System.out.println(f1.cancelAllBookings());
	}
}
