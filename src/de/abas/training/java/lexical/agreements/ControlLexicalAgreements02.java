package de.abas.training.java.lexical.agreements;

import java.io.UnsupportedEncodingException;

/**
 * Shows lexical agreements in Java.
 *
 * @author abas Software AG
 *
 */
public class ControlLexicalAgreements02 {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// case sensitive ----------------------------
		String read = "eins";
		String input = "zwei";

		// Escape sequences --------
		// \n new line
		// \f form feed
		// \r carriage return
		// \t horizontal tabulator
		// \"
		// Unicode:
		// Pi = 03C0
		// ß = 00df
		// default encoding: CP-1252 / Windows
		// ---> setting encoding:
		// Window > Preferences > General > Workspace
		// Text file encoding > Other > UTF-8
		// New text file line delimiter > Other > Unix
		System.out.println(read + "\n\t" + input + "\n" + '\u00df' + " -- "
				+ '\u03C0' + " -- " + '\u03A9');
	}
}
