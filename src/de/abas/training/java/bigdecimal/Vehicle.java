package de.abas.training.java.bigdecimal;

import java.math.BigDecimal;

/**
 * Vehicle class defining all attributes and methods of a Vehicle object.
 * 
 * @author abas Software AG
 *
 */
public class Vehicle{
	
	String color;
	double length;
	boolean started;
	Motor motor;
	String vehicleSequenceNumber;
	BigDecimal salesPrice;
	
	/**
	 * Default constructor, defines standard values.
	 */
	public Vehicle() {
		this("", 5.0, false, new Motor(), "", null);
	}

	/**
	 * User defined constructor.
	 * 
	 * @param color The vehicle's color.
	 * @param length The vehicle's length.
	 * @param started Whether or not the vehicle is started.
	 * @param motor The vehicle's motor.
	 * @param vehicleSequenceNumber The vehicle's sequence number.
	 * @param salesPrice The vehicle's sales price.
	 */
	public Vehicle(String color, double length, boolean started, 
			Motor motor, String vehicleSequenceNumber, BigDecimal salesPrice) {
		super();
		this.color = color;
		this.length = length;
		this.started = started;
		this.motor = motor;
		this.vehicleSequenceNumber = vehicleSequenceNumber;
		this.salesPrice = salesPrice;
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
