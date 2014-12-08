package de.abas.training.java.stringbuffer;

/**
 * Shows how to work with StringBuffer objects.
 *
 * @author abas Software AG
 *
 */
public class ControlStringBuffer {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Creates and outputs new StringBuffer object");
		StringBuffer stringBuffer = new StringBuffer("Hello");

		stringBuffer.append(" ");
		stringBuffer.append("Java");
		stringBuffer.append(" ");
		stringBuffer.append("World");

		System.out.println(stringBuffer.toString());

		System.out.println("Searches and replaces substrings");
		String subString = "Java";
		String newString = "AJO";
		int indexOf = stringBuffer.indexOf(subString);
		stringBuffer.replace(indexOf, indexOf + subString.length(), newString);
		System.out.println(stringBuffer.toString());

		System.out.println();
		// Insert brackets -----------------------------------
		System.out.println("Insert round brackets");
		indexOf = stringBuffer.indexOf(newString);
		stringBuffer.insert(indexOf + newString.length(), ")");
		stringBuffer.insert(indexOf, "(");
		System.out.println(stringBuffer.toString());
	}
}
