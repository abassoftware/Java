package de.abas.training.java.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Shows how to read from console using a BufferedReader object.
 *
 * @author abas Software AG
 *
 */
public class ControlInBufferedReader {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		try {
			System.out.print("Bitte Text eingeben:");
			String readLine = bufferedReader.readLine();
			System.out.println("Eingabe war: " + readLine);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
