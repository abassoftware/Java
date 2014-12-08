package de.abas.training.java.interfacecloneobject;

/**
 * Shows how to implement the Cloneable interface.
 *
 * @author abas Software AG
 *
 */
public class ControlVehicleClone {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("silver", 4.6, false, new Motor(),
				"12345");
		// Vehicle vehicle = new Vehicle();
		// displays attributes of vehicle1
		System.out.println(vehicle.color + " - " + vehicle.length + " - "
				+ vehicle.motor.power);
		System.out.println(vehicle);
		// clones vehicle1
		Vehicle vehicleClone = vehicle.clone();

		System.out.println(vehicleClone);
		System.out.println(vehicleClone.color + " | " + vehicleClone.length
				+ " | " + vehicleClone.motor.power);
	}
}
