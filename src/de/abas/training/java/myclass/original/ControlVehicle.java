package de.abas.training.java.myclass.original;

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
		vehicle.color = "blue";
		// Motor objects have to be created using a constructor
		vehicle.motor.power = 120;

		String output = "Vehicle: - " + vehicle.color + " - Power: "
				+ vehicle.motor.power;

		MyUtils.display(output);
	}
}
