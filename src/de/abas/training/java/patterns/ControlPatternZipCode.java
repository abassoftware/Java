package de.abas.training.java.patterns;

/**
 * Shows how to validate a ZIP code using a regular expression.
 *
 * @author abas Software AG
 *
 */
public class ControlPatternZipCode {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		String zipCode = "02041";
		String ctryCode = "D";

		if ("D".equals(ctryCode)) {
			if (!(zipCode.matches("[1-9][0-9]{4}") || zipCode
					.matches("0[1-9][0-9]{3}"))) {
				System.out.println("Not a valid German ZIP code.");
			}
		} else if ("CH".equals(ctryCode)) {
			if (!zipCode.matches("[1-9][0-9]{3}")) {
				System.out.println("Not a valid Swiss ZIP code.");
			}
		}
	}
}
