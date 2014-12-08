package de.abas.training.java.myclass.original;

/**
 * Vehicle class defining all attributes and methods of a Vehicle object.
 *
 * @author abas Software AG
 *
 */
public class Vehicle {
	String vehicleSequenceNumber;
	String color;
	double length;
	boolean started;
	Motor motor;

	/**
	 * Displays information.
	 */
	public void displayInfo() {
		System.out.println("Vehicle sequence number: "
				+ this.vehicleSequenceNumber + " - " + "Color: " + this.color
				+ " - " + "Length: " + this.length + " - " + "started: "
				+ this.started);
	}

	/**
	 * Method to determine whether or not the vehicle is started.
	 *
	 * @return True if the vehicle is started, otherwise false.
	 */
	public boolean isStarted() {
		return this.started;
	}
}
