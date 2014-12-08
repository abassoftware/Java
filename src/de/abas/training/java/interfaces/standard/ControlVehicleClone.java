package de.abas.training.java.interfaces.standard;

/**
 * Shows how to use an interface as a data type.
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
		Vehicle vehicle = new Vehicle("silber", 4.6, false, new Motor(),
				"12345");
		// Vehicle vehicle = new Vehicle();
		// prints vehicle attributes
		System.out.println(vehicle.color + " - " + vehicle.length + " - "
				+ vehicle.vehicleSequenceNumber);
		System.out.println(vehicle);
		// clones vehicle
		Vehicle vehicleCloned = vehicle.clone();
		System.out.println(vehicleCloned);
		System.out.println(vehicleCloned.color + " | " + vehicleCloned.length
				+ " | " + vehicleCloned.vehicleSequenceNumber);

		System.out.println("-----------------------------------");
		// interface is used as type
		// Array of type Cloneable created and initialized
		Cloneable[] arrayClonable = { vehicle, vehicleCloned };

		// print contents of the Array
		for (int i = 0; i < arrayClonable.length; i++) {
			if (arrayClonable[i] instanceof Vehicle) {
				Vehicle vehicleInArray = (Vehicle) arrayClonable[i];
				System.out.println(vehicleInArray.color + " + "
						+ vehicleInArray.length + " + "
						+ vehicleInArray.vehicleSequenceNumber);
			}
		}
	}
}
