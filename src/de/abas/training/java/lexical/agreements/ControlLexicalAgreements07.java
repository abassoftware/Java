package de.abas.training.java.lexical.agreements;

/**
 * Shows lexical agreements in Java.
 *
 * @author abas Software AG
 *
 */
public class ControlLexicalAgreements07 {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Assignment operators
		int index = 0;

		index += 1;
		index += 3;
		index += 1;
		index -= 2;

		System.out.println("index: " + index);

		// Other operators
		String string = new String("Fahrzeug");
		System.out.println(string);

		Customer customer = new Customer();
		customer.name = "Miller";
		System.out.println(customer + " --> " + customer.name);

		Object testCustomer = customer;
		System.out.println(testCustomer);

		if (testCustomer instanceof Customer) {
			Customer castCustomer = (Customer) testCustomer;
			System.out.println(castCustomer.name);
		}
	}
}
