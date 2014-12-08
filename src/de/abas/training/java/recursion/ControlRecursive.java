package de.abas.training.java.recursion;

/**
 * Show the recursion programming concept.
 *
 * @author abas Software AG
 *
 */
public class ControlRecursive {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		MyMathUtils myMathUtils = new MyMathUtils();
		long factorialOf = 5;
		// Example: 5! = 1 * 2 * 3 * 4 * 5 -> 120
		// 0! = 1

		long result = myMathUtils.factorial(factorialOf);
		System.out.println("Result: " + factorialOf + "! = " + result);
	}
}
