package de.abas.training.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * Shows usage of an ArrayList.
 * 
 * @author abas Software AG
 *
 */
public class ControlArrayList {

	/**
	 * Method to start the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// stores an instance of ArrayList in a variable of the type List
		List<Vehicle> arrayList = new ArrayList<Vehicle>();
		
		arrayList.add(new Vehicle("green", 4.90, false, new Motor(), "1234567_001"));
		arrayList.add(new Vehicle("blue", 5.0, true, new Motor(), "1234567_002"));
		arrayList.add(new Vehicle("yellow", 5.2, false, new Motor(), "1234568_001"));
		
		// add the same object twice to the ArrayList
		// arrayList.add(new Vehicle("blue", 5.0, true, new Motor(), "1234567_002"));
		for (Vehicle vehicle : arrayList) {
			System.out.println(vehicle.color + " is started: " + 
					vehicle.started + " -> " + vehicle.vehicleSequenceNumber);
		}
		
		System.out.println("--------------------------------");
		// checks whether the same vehicle is already in the ArrayList
		Vehicle myVehicle = new Vehicle("blue", 5.0, true, new Motor(), "1234567_003");
		arrayList.add(myVehicle);
		
		// avoiding duplicate objects
		if(arrayList.contains(myVehicle)){
			System.out.println("Fahrzeug: " + 
					myVehicle.vehicleSequenceNumber + " vorhanden");
		}else {
			System.out.println("Fahrzeug: " + 
					myVehicle.vehicleSequenceNumber + " NICHT vorhanden");
			arrayList.add(myVehicle);
		}
		
		for (Vehicle fahrzeug : arrayList) {
			System.out.println(fahrzeug.color + " is started: " + 
					fahrzeug.started + " -> " + fahrzeug.vehicleSequenceNumber);
		}		
	}
}
