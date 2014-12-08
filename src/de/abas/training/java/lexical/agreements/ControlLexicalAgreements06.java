package de.abas.training.java.lexical.agreements;

/**
 * Shows lexical agreements in Java.
 *
 * @author abas Software AG
 *
 */
public class ControlLexicalAgreements06 {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Operators

		// Arithmetic operators ---------------------
		double number1 = 200;
		double number2 = 50;
		double result = 0;

		result = number1 + number2;
		System.out.println("Result: " + result);

		System.out.println(number1 + " + " + number2 + " = "
				+ (number1 + number2));
		System.out.println(number1 + " / " + number2 + " = "
				+ (number1 / number2));

		// Output formatted
		System.out.printf("%4.2f" + " / " + "%4.2f" + " = " + "%4.2f" + "\n",
				number1, number2, (number1 / number2));

		// Relational, logical operators
		if (number1 > number2) {
			System.out.println(number1 + " greater than " + number2);
		} else {
			System.out.println(number1 + " small than or same as " + number2);
		}

		double number3 = 100;
		double number4 = 100;
		if ((number1 > number2) && (number3 == number4)) {
			System.out.println(number1 + " > " + number2 + " AND " + number3
					+ " equals " + number4);
		}

		String read;
		read = null;
		read = "New Products";
		if (read != "") {
			System.out.println("String has the following content: " + read);
		} else {
			System.out.println("String was not initialized");
		}

	}
}
