package de.abas.training.java.methoden.overload;

/**
 * Vehicle class defining all attributes and methods of a Vehicle object.
 *
 * @author abas Software AG
 *
 */
public class Vehicle {
	private String vehicleSequenceNumber;
	private String color;
	private double length;
	private boolean started;

	/**
	 * Default constructor, defines standard values.
	 */
	public Vehicle() {
		// Default constructor
	}

	/**
	 * User defined constructor.
	 *
	 * @param vehicleSequenceNumber The vehicle's sequence number.
	 * @param color The vehicle's color.
	 * @param length The vehicle's length.
	 * @param started Whether or not the vehicle is started.
	 */
	public Vehicle(String vehicleSequenceNumber, String color, double length,
			boolean started) {
		super();
		this.vehicleSequenceNumber = vehicleSequenceNumber;
		this.color = color;
		this.length = length;
		this.started = started;
	}

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
	 * Displays information with initial output.
	 *
	 * @param output Initial output.
	 */
	public void displayInfo(String output) {
		System.out.print(output + ": ");
		this.displayInfo();
	}

	/**
	 * Gets the vehicle's color.
	 *
	 * @return The vehicle's color.
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Gets the vehicle's length.
	 *
	 * @return The vehicle's length.
	 */
	public double getLength() {
		return this.length;
	}

	/**
	 * Gets the vehicle's sequence number.
	 *
	 * @return The vehicle's sequence number.
	 */
	public String getVehicleSequenceNumber() {
		return this.vehicleSequenceNumber;
	}

	/**
	 * Method to determine whether or not the vehicle is started.
	 *
	 * @return True if the vehicle is started, otherwise false.
	 */
	public boolean isStarted() {
		return this.started;
	}

	/**
	 * Sets the vehicle's color.
	 *
	 * @param color The value to set the vehicle's color to.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Sets the vehicle's length.
	 *
	 * @param length The value to set the vehicle's length to.
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * Sets the vehicle's started value.
	 *
	 * @param started The value to set the vehicle's started value to.
	 */
	public void setStarted(boolean started) {
		this.started = started;
	}

	/**
	 * Sets the vehicle's sequence number.
	 *
	 * @param vehicleSequenceNumber The value to set the vehicle's sequence
	 * number to.
	 */
	public void setVehicleSequenceNumber(String vehicleSequenceNumber) {
		this.vehicleSequenceNumber = vehicleSequenceNumber;
	}
}
