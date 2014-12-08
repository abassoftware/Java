package de.abas.training.java.mustererkennen;

/**
 * Shows how to work with regular expressions.
 *
 * @author abas Software AG
 *
 */
public class ControlPatterns {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "12045";

		// \d -> digit [0-9]
		// consists of exactly 5 digits
		if (string.matches("\\d{5}")) {
			System.out.println(string + " ist Ok");
		} else {
			System.out.println(string + " ist NICHT Ok");
		}
		System.out.println("--------------------------");

		// \w -> alphanumeric character [0-9a-zA-Z]
		// consists of exactly 10 alphanumeric characters
		string = "1231abcDEF";
		if (string.matches("\\w{10}")) {
			System.out.println(string + " ist Ok");
		} else {
			System.out.println(string + " ist NICHT Ok");
		}
		System.out.println("--------------------------");

		// . -> any character
		// consists of exactly 10 characters
		string = "1;31a_-bcD1";
		if (string.matches(".{10}")) {
			System.out.println(string + " ist Ok");
		} else {
			System.out.println(string + " ist NICHT Ok");
		}
		System.out.println("--------------------------");

		// \D -> Non-digits
		// consists of any number of non-digit characters
		string = "A;xxqa_-bcD";
		if (string.matches("\\D*")) {
			System.out.println(string + " ist Ok");
		} else {
			System.out.println(string + " ist NICHT Ok");
		}
		System.out.println("--------------------------");

		// \D -> Non-digits
		// consists of at least one non-digit character
		string = "A;xxxxq_-bcD";
		if (string.matches("\\D+")) {
			System.out.println(string + " ist Ok");
		} else {
			System.out.println(string + " ist NICHT Ok");
		}
		System.out.println("--------------------------");

		// \D -> Non-digits
		// consists of any number of non-digit characters
		string = "A;q_-bc";
		if (string.matches("A?;?x?q?_?-?b?c?")) {
			System.out.println(string + " ist Ok");
		} else {
			System.out.println(string + " ist NICHT Ok");
		}
		System.out.println("--------------------------");
	}
}
