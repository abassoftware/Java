package de.abas.training.java.collections.treeset;

/**
 * Vehicle class defining all attributes and methods of a Vehicle object.
 *
 * @author abas Software AG
 *
 */
public class Vehicle implements Comparable<Vehicle> {

	String color;
	double length;
	boolean started;
	Motor motor;
	String vehicleSequenceNumber;

	/**
	 * Default constructor, defines standard values.
	 */
	public Vehicle() {
		this("", 5.0, false, new Motor(), "");
	}

	/**
	 * User defined constructor.
	 *
	 * @param color The vehicle's color.
	 * @param length The vehicle's length.
	 * @param started Whether or not the vehicle is started.
	 * @param motor The vehicle's motor.
	 * @param vehicleSequenceNumber The vehicle's sequence number.
	 */
	public Vehicle(String color, double length, boolean started, Motor motor,
			String vehicleSequenceNumber) {
		super();
		this.color = color;
		this.length = length;
		this.started = started;
		this.motor = motor;
		this.vehicleSequenceNumber = vehicleSequenceNumber;
	}

	@Override
	public int compareTo(Vehicle vehicle) {
		return this.vehicleSequenceNumber
				.compareTo(vehicle.vehicleSequenceNumber);
	}

	/**
	 * Method to display the vehicles color.
	 */
	public void displayColor() {
		System.out.println(this.color);
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
