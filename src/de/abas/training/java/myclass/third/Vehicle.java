package de.abas.training.java.myclass.third;

/**
 * Vehicle class defining all attributes and methods of a Vehicle object.
 *
 * @author abas Software AG
 *
 */
public class Vehicle {

	String color;
	double length;
	boolean started;
	String vehicleSequenceNumber;

	/**
	 * Default constructor, defines standard values.
	 */
	public Vehicle() {
		this("", "", 5.0, false);
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
	 * Method to display the vehicles color.
	 */
	public void displayColor() {
		System.out.println(this.color);
	}

	@Override
	public boolean equals(Object obj) {
		Vehicle vehicle = (Vehicle) obj;
		return this.vehicleSequenceNumber.equals(vehicle.vehicleSequenceNumber);

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
	 * Sets the vehicle's sequence number.
	 *
	 * @param vehicleSequenceNumber The value to set the vehicle's sequence
	 * number to.
	 */
	public void setVehicleSequenceNumber(String vehicleSequenceNumber) {
		this.vehicleSequenceNumber = vehicleSequenceNumber;

	}
}
