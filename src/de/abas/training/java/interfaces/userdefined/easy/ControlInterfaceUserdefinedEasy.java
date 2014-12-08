package de.abas.training.java.interfaces.userdefined.easy;

/**
 * Shows how to implement user defined interfaces.
 *
 * @author abas Software AG
 *
 */
public class ControlInterfaceUserdefinedEasy {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("12345-001", "Jeep", "silver");

		vehicle.startEngine();
		vehicle.accelerate(50);
		vehicle.applyBreak(60);
		int speed = vehicle.getSpeed();
		System.out.println("Speed: " + speed);
		vehicle.applyBreak(30);
	}
}
