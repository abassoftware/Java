package de.abas.training.java.lexical.agreements;

/**
 * Shows lexical agreements in Java.
 *
 * @author abas Software AG
 *
 */
public class ControlLexicalAgreements03 {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		// Comments --------------------------------
		// single-line comment

		/*
		 * multiline comment
		 */

		/**
		 * Javadoc comment
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

		// Constant null
		ControlLexicalAgreements03 controlLexicalAgreements = null;
		System.out.println(controlLexicalAgreements);

		// User defined constants
		final String ERROR_MESSAGE = "Error message";
		System.out.println(ERROR_MESSAGE);
		final double MWST = 19.0;

		double net = 1200.00;
		double gross = net + ((net * MWST) / 100);
		// Standard output format
		System.out.println("Net: " + net + " €");
		System.out.println("Gross: " + gross + " €");

		// Output formatting
		System.out.printf("Net: " + "%10.2f" + " €" + "\n", net);
		System.out.printf("Gross: " + "%10.2f" + " €" + "\n", gross);

	}
}
