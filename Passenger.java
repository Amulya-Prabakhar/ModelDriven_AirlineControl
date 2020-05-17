/*
File Name: Passenger.java
Authors: Amulya Prabakhar, Bindu Reddy
*/

import java.util.*;
public class Passenger extends Person{
	public int Passport_Number;
	public Passenger(String name, String address, String email, int tel,int passport_Number) {
		super(name, address, email, tel);
		Passport_Number = passport_Number;
		
	} 
}
