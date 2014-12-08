package de.abas.training.java.interfaces.userdefined.easy;

import java.util.Date;

/**
 * Vehicle class defining all attributes and methods of a Vehicle object.
 *
 * @author abas Software AG
 *
 */
public class Vehicle implements Service, VehicleFunctions {

	private String vehicleSequenceNumber;
	private String carDesign;
	private String color;

	private Date serviceAppointment;

	private boolean engineStarted;
	private int speed;

	private final int MAX_SPEED = 180;

	/**
	 * User defined constructor.
	 *
	 * @param vehicleSequenceNumber The vehicle's sequence number.
	 * @param carDesign The vehicle's design.
	 * @param color The vehicle's color.
	 */
	public Vehicle(String vehicleSequenceNumber, String carDesign, String color) {
		super();
		this.vehicleSequenceNumber = vehicleSequenceNumber;
		this.carDesign = carDesign;
		this.color = color;
	}

	@Override
	public void accelerate(int increment) {
		if (this.engineStarted) {
			if ((this.speed + increment) > this.MAX_SPEED) {
				System.out.println("speed: " + this.speed + " - speedUp: "
						+ increment + " not possible -> max speed: "
						+ this.MAX_SPEED);
			} else {
				this.speed += increment;
				System.out.println("speed: " + this.speed);
			}
		} else {
			System.out.println("engine not started");
		}
	}

	@Override
	public void applyBreak(int decrement) {
		if (this.engineStarted) {
			if ((this.speed - decrement) < 0) {
				System.out.println("speed: " + this.speed + " - apply break: "
						+ decrement + " not possible -> min speed: 0");
			} else {
				this.speed -= decrement;
				System.out.println("speed: " + this.speed);
			}
		} else {
			System.out.println("engine not started");
		}
	}

	/**
	 * Gets the vehicle's design.
	 *
	 * @return The vehicle's design.
	 */
	public String getCarDesign() {
		return this.carDesign;
	}

	/**
	 * Gets the vehicle's color.
	 *
	 * @return The vehicle's color.
	 */
	public String getColor() {
		return this.color;
	}

	@Override
	public Date getServiceAppointment() {
		return this.serviceAppointment;
	}

	/**
	 * Gets the vehicle's speed.
	 *
	 * @return The vehicle's speed.
	 */
	public int getSpeed() {
		return this.speed;
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
	 * Sets the vehicle's design.
	 *
	 * @param carDesign The value to set the vehicle's design to.
	 */
	public void setCarDesign(String carDesign) {
		this.carDesign = carDesign;
	}

	/**
	 * Sets the vehicle's color.
	 *
	 * @param color The value to set the vehicle's color to.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void setServiceAppointment(Date serviceAppointment) {
		this.serviceAppointment = serviceAppointment;
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

	@Override
	public void startEngine() {
		if (this.engineStarted == false) {
			this.engineStarted = true;
		} else {
			System.out.println("engine is running");
		}
	}

	@Override
	public void stopEngine() {
		if (this.engineStarted == true) {
			this.engineStarted = false;
		} else {
			System.out.println("engine is not running");
		}
	}
}
