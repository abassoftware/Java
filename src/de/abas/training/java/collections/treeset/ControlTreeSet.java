package de.abas.training.java.collections.treeset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Shows usage of TreeSet.
 *
 * @author abas Software AG
 *
 */
public class ControlTreeSet {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<Vehicle> treeSet = new TreeSet<Vehicle>();

		treeSet.add(new Vehicle("yellow", 5.2, false, new Motor(),
				"1234567_001"));
		treeSet.add(new Vehicle("green", 4.90, false, new Motor(),
				"1234567_003"));
		treeSet.add(new Vehicle("blue", 5.0, true, new Motor(), "1234567_002"));

		// If Vehicle objects are to be stored in a TreeSet object, the Vehicle
		// class has to implement the Comparable interface and its unimplemented
		// method compareTo
		for (Vehicle vehicle : treeSet) {
			System.out.println(vehicle.vehicleSequenceNumber + " - "
					+ vehicle.color);
		}

		// only non-existent Vehicle objects are added
		System.out.println("----------------------------");
		Vehicle newVehicle = new Vehicle("xxxxx", 5.2, false, new Motor(),
				"1234567_001");
		// adds duplicate Vehicle object
		// Vehicle newVehicle = new Vehicle("xxxxx", 5.2, false, new Motor(),
		// "1234567_004");
		// adds without checking for duplicates -> no message
		treeSet.add(newVehicle);

		// adds with checking for duplicate -> message
		// if (treeSet.contains(newVehicle)) {
		// System.out.println(newVehicle.vehicleSequenceNumber
		// + " already exists.");
		// } else {
		// System.out.println(newVehicle.vehicleSequenceNumber
		// + " does not exist and will be added.");
		// treeSet.add(newVehicle);
		// }

		Iterator<Vehicle> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Vehicle vehicle = iterator.next();
			System.out.println(vehicle.vehicleSequenceNumber + " - "
					+ vehicle.color);
		}
	}
}
