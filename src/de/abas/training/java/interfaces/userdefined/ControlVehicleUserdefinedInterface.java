package de.abas.training.java.interfaces.userdefined;

/**
 * Shows how to implement user defined interfaces.
 *
 * @author abas Software AG
 *
 */
public class ControlVehicleUserdefinedInterface {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("red", 5.5, false, new Motor(),
				"65431_001");

		System.out.println(vehicle);
	}

}
