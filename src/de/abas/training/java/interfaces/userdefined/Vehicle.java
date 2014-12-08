package de.abas.training.java.interfaces.userdefined;

import java.util.Date;

/**
 * Vehicle class defining all attributes and methods of a Vehicle object.
 *
 * @author abas Software AG
 *
 */
public class Vehicle implements DisplayInformation, Service, VehicleFunctions {

	String color;
	double length;
	boolean started;
	Motor motor;
	String vehicleSequenceNumber;
	Date serviceAppointment;
	int serviceIntervalDays;
	int speed;
	String autoBodyDesign;
	int periodOfGuarantee;

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
	public void accelerate(int increment) {
		if (this.isStarted()) {
			System.out.println("driving ...");
		} else {
			System.out.println("start engine first");
		}

	}

	@Override
	public void applyBreak(int decrement) {
		// TODO Auto-generated method stub

	}

	/**
	 * Method to display the vehicles color.
	 */
	public void displayColor() {
		System.out.println(this.color);
	}

	@Override
	public void displayInformationDetailed() {
		System.out.println(this.vehicleSequenceNumber + " - "
				+ this.serviceAppointment + " - " + this.motor.manufacturer
				+ "  - " + this.motor.powerFuel);

	}

	@Override
	public void displayInformationShort() {
		System.out.println(this.vehicleSequenceNumber + " - "
				+ this.serviceAppointment);

	}

	@Override
	public Date getServiceAppointment() {
		return this.serviceAppointment;
	}

	@Override
	public int getServiceInterval() {
		return this.serviceIntervalDays;
	}

	/**
	 * Method to determine whether or not the vehicle is started.
	 *
	 * @return True if the vehicle is started, otherwise false.
	 */
	public boolean isStarted() {
		return this.started;
	}

	@Override
	public void setServiceAppointment(Date serviceAppointment) {
		this.serviceAppointment = serviceAppointment;
	}

	@Override
	public void setServiceInterval(int serviceIntervalDays) {
		this.serviceIntervalDays = serviceIntervalDays;
	}

	@Override
	public void startEngine() {
		this.started = true;
	}

	@Override
	public void stopEngine() {
		this.started = false;
	}

}
