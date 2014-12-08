package de.abas.training.java.lexical.agreements;

/**
 * Shows lexical agreements in Java.
 *
 * @author abas Software AG
 *
 */
public class ControlLexicalAgreements09 {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Control structures

		// loops
		// for loop
		for (int index = 0; index < 10; index++) {
			System.out.println(index);
		}

		// while loop
		boolean cancel = false;
		int index = 0;
		while (cancel == false) {
			System.out.println("while: " + ++index);
			if (index == 5) {
				cancel = true;
			}
		}

		// do-while loop
		cancel = false;
		index = 0;
		do {
			++index;
			System.out.println("do-while: " + index);
			if (index == 5) {
				cancel = true;
			}
		} while (cancel == false);
	}
}
