package de.abas.training.java.recursion;

/**
 * Utility class for calculations.
 *
 * @author abas Software AG
 *
 */
public class MyMathUtils {

	/**
	 * Calculates the factorial of a specified number.
	 *
	 * @param factorialOf Number of which to calculate the factorial.
	 * @return The result.
	 */
	public long factorial(long factorialOf) {
		if ((factorialOf == 0) || (factorialOf == 1)) {
			return 1;
		} else {
			return factorialOf * this.factorial(factorialOf - 1);
		}
	}
}
