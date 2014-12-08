package de.abas.training.java.lexical.agreements;

/**
 * Shows lexical agreements in Java.
 *
 * @author abas Software AG
 *
 */
public class ControlLexicalAgreements05 {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// type cast
		int integerValue = 100;
		double doubleValue = 0;

		// implicit type cast
		doubleValue = integerValue;
		System.out.println("integer value: " + integerValue);

		// explicit type cast
		int newIntegerValue = 0;
		newIntegerValue = (int) doubleValue;
		System.out.println("new integer value: " + newIntegerValue);
	}
}
