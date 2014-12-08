package de.abas.training.java.collections.hashmap;

import java.util.HashMap;
import java.util.Set;

/**
 * Shows usage of HashMap.
 *
 * @author abas Software AG
 *
 */
public class ControlHashMap {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, Vehicle> hashMap = new HashMap<String, Vehicle>();

		String newKey = null;

		for (int index = 0; index < 10; index++) {
			newKey = "12345_" + index;
			putVehicle(newKey, hashMap);
		}

		// displays the content of the HashMap object
		displayContent(hashMap);

		// checks whether a defined key already exists
		// if yes, details about the key value pair is output
		// if no, a message is output
		newKey = "12345_2";
		checkKey(hashMap, newKey);

		System.out.println("----------------------------");
		// overrides value of a specified key
		hashMap.put(newKey, new Vehicle("light red", 5.0, true, new Motor(),
				newKey));
		displayContent(hashMap);
		checkKey(hashMap, newKey);
	}

	/**
	 * Checks whether a key already exists in the HashMap object.
	 *
	 * @param hashMap The HashMap object.
	 * @param newKey The key to check for.
	 */
	private static void checkKey(HashMap<String, Vehicle> hashMap, String newKey) {
		if (hashMap.containsKey(newKey)) {
			Vehicle fahrzeug = hashMap.get(newKey);
			System.out.println("Fahrzeug: " + fahrzeug.vehicleSequenceNumber
					+ " - " + fahrzeug.color);
		} else {
			System.out.println("Key: " + newKey + " nicht vorhanden");
		}
	}

	/**
	 * Displays the content of a HashMap object.
	 *
	 * @param hashMap The HashMap object.
	 */
	private static void displayContent(HashMap<String, Vehicle> hashMap) {
		Set<String> keySet = hashMap.keySet();
		for (String key : keySet) {
			System.out.println("Key: " + key);
		}
	}

	/**
	 * Inputs a hard coded vehicle into the HashMap object paired to the key
	 * given as parameter.
	 *
	 * @param key The key to pair to the value.
	 * @param hashMap The HashMap to input into.
	 */
	private static void putVehicle(String key, HashMap<String, Vehicle> hashMap) {
		Vehicle vehicle;
		vehicle = new Vehicle("green", 4.7, false, new Motor(), key);
		hashMap.put(key, vehicle);
	}
}
