package de.abas.training.java.lexical.agreements;

import java.util.Random;

/**
 * Shows lexical agreements in Java.
 *
 * @author abas Software AG
 *
 */
public class ControlLexicalAgreements08 {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// control structures
		int number1 = 50;
		int number2 = 200;

		// if command
		if (number1 == number2) {
			System.out.println(number1 + " == " + number2);
		} else {
			System.out.println(number1 + " != " + number2);
		}

		// if/else if command
		if (number1 <= 50) {
			System.out.println(number1 + " <= 50");
		} else if ((number1 > 50) && (number1 <= 100)) {
			System.out.println(number1 + " > 50 UND <= 100");
		} else if ((number1 > 100) && (number1 <= 200)) {
			System.out.println(number1 + " > 100 UND <= 200");
		} else {
			System.out.println(number1 + " > 200");
		}

		// switch-case
		Random random = new Random();
		int grade = random.nextInt(6) + 1;
		System.out.println("Grade: " + grade);
		switch (grade) {
		case 1:
			System.out.println("Excellent");
			break;
		case 2:
			System.out.println("Good");
			break;
		case 3:
			System.out.println("Average");
			break;
		case 4:
			System.out.println("Difficulties");
			break;
		case 5:
			System.out.println("Failing");
			break;
		case 6:
			System.out.println("Failing");
			break;
		default:
			System.out.println("Unknown");
			break;
		}

	}
}
