package de.abas.training.java.exceptionhandling;

/**
 * Shows how exception handling works in Java - ArrayIndexOutOfBoundsException.
 *
 * @author abas Software AG
 *
 */
public class ControlExceptionHandling_Array {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		String[] myArray = { "one", "two", "three", "four", "five" };

		try {
			// '<=' triggers the exception
			for (int i = 0; i <= myArray.length; i++) {
				System.out.println(myArray[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception-Handling: " + e.getCause() + " - "
					+ e.getMessage());
		} finally {
			System.out.println("... is always executed");
		}
		System.out.println("continue program");
	}
}
