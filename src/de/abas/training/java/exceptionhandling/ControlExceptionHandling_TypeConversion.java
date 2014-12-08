package de.abas.training.java.exceptionhandling;

import java.math.BigDecimal;

/**
 * Shows how exception handling works in Java - NumberFormatException.
 *
 * @author abas Software AG
 *
 */
public class ControlExceptionHandling_TypeConversion {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Right format
		// String read = "1234.56";
		// Wrong format -> NumberFormatException
		String read = "1234,56";

		// it is best to avoid exception handling where possible, so if
		// (!lesen.contains(",")) ... would be better, however exception
		// handling cannot always be avoided
		// if(!lesen.contains(",")){
		try {
			BigDecimal number = new BigDecimal(read);
			System.out.println("Number: " + number);
		} catch (NumberFormatException e) {
			System.out.println("A problem occurred while converting '" + read
					+ "' to BigDecimal: " + e.getMessage());
		}
		// }
	}
}
