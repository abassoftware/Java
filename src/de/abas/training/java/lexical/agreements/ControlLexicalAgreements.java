package de.abas.training.java.lexical.agreements;

/**
 * Shows lexical agreements in Java.
 *
 * @author abas Software AG
 *
 */
public class ControlLexicalAgreements {

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

		// Escape sequences --------
		// \n new line
		// \f form feed
		// \r carriage return
		// \t horizontal tabulator
		// \"
		// Unicode:
		// Pi = 03C0
		// � = 00df
		System.out.println(read + "\n\t" + input + "\n" + '\u00df' + " -- "
				+ '\u03c0');

		// Comments --------------------------------
		// single-line comment

		/*
		 * multiline comment
		 */

		/**
		 * JavaDoc comment
		 */

		// Keywords in Java -------------------
		// package, import, static, class, extends, implements, instanceof,
		// interface, new, abstract, final
		// public, private, void, this, super, break, try, catch, throw, usw.
		// Not used: const, goto

		// Constants --------------------------------
		// boolean constants
		boolean status = false;
		System.out.println("Status: " + status);

		// constant null
		ControlLexicalAgreements controlLexicalAgreements = null;
		System.out.println(controlLexicalAgreements);

		// user defined constants
		final String ERROR_MESSAGE = "Error message";
		System.out.println(ERROR_MESSAGE);
		final double MWST = 19.0;

		double net = 1200.00;
		double gross = net + ((net * MWST) / 100);
		// standard output formats
		System.out.println("Net: " + net + " �");
		System.out.println("Gross: " + gross + " �");

		// output formatting
		System.out.printf("Net: " + "%10.2f" + " �" + "\n", net);
		System.out.printf("Gross: " + "%10.2f" + " �" + "\n", gross);

	}
}
