package de.abas.training.java.read.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Shows how to read from a file.
 *
 * @author abas Software AG
 *
 */
public class ControlReadFile {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String pathAndFile = "files/Vehicle.txt";
			BufferedReader bufferedReader = new BufferedReader(new FileReader(
					pathAndFile));

			String readLine = "";

			// reads field names
			readLine = bufferedReader.readLine();
			String[] fieldName = readLine.split(";");
			displayElements(fieldName);

			String[] fieldValue = null;
			while ((readLine = bufferedReader.readLine()) != null) {
				fieldValue = readLine.split(";");
				displayElements(fieldValue);
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Iterates array and outputs all of its elements.
	 *
	 * @param array The array to iterate.
	 */
	private static void displayElements(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
