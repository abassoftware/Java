package de.abas.training.java.string;

/**
 * Shows usage of String class.
 *
 * @author abas Software AG
 *
 */
public class ControlString {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		String text1 = new String("first String");
		String text2 = "second String";

		System.out.println(text1);
		System.out.println(text2);

		// methods of String class
		System.out.println("starts with - ends with ------------------------");
		String[] name = { "Maier", "Meier", "Mayer", "Müller" };
		// check start and end of string
		final String STARTS_WITH = "Ma";
		final String ENDS_WITH = "er";
		for (int i = 0; i < name.length; i++) {
			if (name[i].startsWith(STARTS_WITH) && name[i].endsWith(ENDS_WITH)) {
				System.out.println(name[i]);
			}
		}

		// get substring
		System.out.println("Working with substrings -------------------------");
		String original = "Welcome to Java Training";
		String subString = "Java";
		String replaceString = "AJO";
		System.out.println(original);
		String changedOriginal = original.replace(subString, replaceString);
		System.out.println(changedOriginal);

		System.out.println(" Substring exists -----------------------");
		int indexOf = original.indexOf(subString);
		int length = subString.length();

		if (indexOf == -1) {
			System.out.println("Substring does not exist '" + subString
					+ "' in '" + original + "'");
		} else {
			System.out.println("Original: " + original);
			System.out.println("Substring '" + subString + "' begins at "
					+ indexOf + " and has " + length + " characters");
		}

		// convert String to upper case
		System.out.println("Convert String to upper case ---------------");
		String upperCase = original.toUpperCase();
		System.out.println(upperCase);

		// convert String to char array
		System.out.println("Convert String to char array ---------");
		char[] charArray = original.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}

		System.out.println("Concat Strings ----------------");
		String string1 = "Zug";
		String string2 = "spitz";
		String string3 = "bahn";

		String complete = string1.concat(string2).concat(string3);
		System.out.println(complete);

	}

}
