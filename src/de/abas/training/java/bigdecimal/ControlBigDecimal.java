package de.abas.training.java.bigdecimal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 * Shows how to calculate using BigDecimals.
 *
 * @author abas Software AG
 *
 */
public class ControlBigDecimal {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		String file = "files/NewVehicles.txt";
		String[] fields = null;
		String[] values = null;
		ArrayList<Vehicle> arrayList = new ArrayList<Vehicle>();

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(
					file));
			String read = "";

			// gets field names
			// name[0] = vehicleSequenceNumber
			// name[1] = color
			// name[2] = length
			// name[3] = salesPrice
			read = bufferedReader.readLine();
			fields = read.split(";");

			System.out.println("Field: ");
			for (String field : fields) {
				System.out.println(field);
			}

			// gets field values
			while ((read = bufferedReader.readLine()) != null) {
				values = read.split(";");
				arrayList.add(new Vehicle(values[1], Double.valueOf(values[2]),
						false, null, values[0], new BigDecimal(values[3])
				.setScale(2)));
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Display content of ArrayList");
		for (Vehicle vehicle : arrayList) {
			System.out.println(vehicle.vehicleSequenceNumber + " - "
					+ vehicle.length + "  - " + vehicle.color + " - "
					+ vehicle.salesPrice);
		}

		System.out.println("Increase sales price");
		for (Vehicle vehicle : arrayList) {
			BigDecimal oldPrice = vehicle.salesPrice;
			BigDecimal newPrice = oldPrice.multiply(new BigDecimal(1.10));
			vehicle.salesPrice = newPrice.setScale(2, RoundingMode.HALF_UP);
		}

		for (Vehicle vehicle : arrayList) {
			System.out.println("Vehicle: " + vehicle.vehicleSequenceNumber
					+ " - " + vehicle.salesPrice);
		}
	}
}
