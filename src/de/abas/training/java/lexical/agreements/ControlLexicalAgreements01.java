package de.abas.training.java.lexical.agreements;

/**
 * Shows lexical agreements in Java.
 *
 * @author abas Software AG
 *
 */
public class ControlLexicalAgreements01 {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// case sensitive ----------------------------
		String read = "test";
		String input = "Test";

		if (read.equals(input)) {
			System.out.println("'" + read + "' identical to '" + input + "'");
		} else {
			System.out.println("'" + read + "' not identical to '" + input
					+ "'");
		}
	}
}
