package de.abas.training.java.methoden.callbyvalue;

/**
 * Shows call by value.
 *
 * @author abas Software AG
 *
 */
public class ControlMethodsCallByValue {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		ControlMethodsCallByValue controlMethodsCallByValue = new ControlMethodsCallByValue();

		double salesprice = 22000.00;
		Vehicle vehicle = new Vehicle("54321_110", "red", 5.1, false);

		// call by value - primitive data type
		System.out.printf("Sales price: " + "%6.2f" + "\n", salesprice);
		controlMethodsCallByValue.calculate(salesprice);
		System.out.printf("Sales price: " + "%6.2f" + "\n", salesprice);

		// call by value - object
		System.out.println("Vehicle sequence number: "
				+ vehicle.getVehicleSequenceNumber());
		controlMethodsCallByValue.changeVehicleSequenceNumber(vehicle);
		System.out.println("Vehicle sequence number: "
				+ vehicle.getVehicleSequenceNumber());
	}

	private void calculate(double salesprice) {
		salesprice = salesprice * 1.1;
		System.out.printf("ber. Verkaufspreis: " + "%6.2f" + "\n", salesprice);
	}

	private void changeVehicleSequenceNumber(Vehicle fahrzeug) {
		fahrzeug.setVehicleSequenceNumber("33333_333");
	}
}
