package de.abas.training.java.myclass.first;

/**
 * Shows how object orientation works in Java.
 *
 * @author abas Software AG
 *
 */
public class ControlVehicle {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.vehicleSequenceNumber = "12345_001";
		vehicle.color = "blue";
		vehicle.length = 5.6;
		vehicle.started = false;

		vehicle.displayInfo();
	}
}
