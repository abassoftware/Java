package de.abas.training.java.methoden.overload;

/**
 * Shows method override principle.
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

		Vehicle vehicle = new Vehicle("12345_002", "blue", 5.6, false);

		vehicle.displayInfo();
		vehicle.displayInfo("Sonderausgabe");
	}
}
