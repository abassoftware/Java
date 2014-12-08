package de.abas.training.java.inout;

import java.io.IOException;

/**
 * Shows how to read from console.
 *
 * @author abas Software AG
 *
 */
public class ControlIn {
	public static void main(String[] args) {
		byte[] byteArray = new byte[256];
		try {
			// system input in console
			System.out.print("Bitte Text eingeben: ");
			System.in.read(byteArray);
			// prints the system input
			System.out.print("Eingabe war: ");
			for (int i = 0; i < byteArray.length; i++) {
				System.out.print((char) byteArray[i]);
			}
			System.out.println();
			System.out.println("------------");
			// converts byte Array to String and prints the string
			String string = new String(byteArray);
			System.out.println(string);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
