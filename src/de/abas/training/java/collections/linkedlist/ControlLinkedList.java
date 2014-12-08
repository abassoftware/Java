package de.abas.training.java.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * Shows usage of a LinkedList.
 *
 * @author abas Software AG
 *
 */
public class ControlLinkedList {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		List<Vehicle> linkedList = new LinkedList<Vehicle>();

		linkedList.add(new Vehicle("yellow", 5.2, false, new Motor(),
				"1234568_001"));
		linkedList.add(new Vehicle("green", 4.90, false, new Motor(),
				"1234567_001"));
		linkedList.add(new Vehicle("blue", 5.0, true, new Motor(),
				"1234567_002"));

		Vehicle newVehicle = new Vehicle("yellow", 5.2, false, new Motor(),
				"1234568_001");
		// creates duplicate Vehicle object
		// Vehicle newVehicle = new Vehicle("yellow", 5.2, false, new Motor(),
		// "1234568_003");
		if (linkedList.contains(newVehicle)) {
			System.out.println("Vehicle " + newVehicle.vehicleSequenceNumber
					+ " already exisits");
		} else {
			linkedList.add(newVehicle);
		}

		System.out.println("------------------------------------------");
		// prints contents of LinkedList
		for (Vehicle vehicle : linkedList) {
			System.out.println(vehicle.vehicleSequenceNumber + " - "
					+ vehicle.color);
		}

		System.out.println("------------------------------------------");
		// removes Vehicle object with index 2 (index ranges from 0 - n)
		linkedList.remove(2);
		// prints contents of LinkedList
		for (Vehicle vehicle : linkedList) {
			System.out.println(vehicle.vehicleSequenceNumber + " - "
					+ vehicle.color);
		}
	}
}
