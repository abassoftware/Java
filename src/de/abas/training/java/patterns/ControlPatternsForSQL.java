package de.abas.training.java.patterns;

/**
 * Shows how to work with regular expressions.
 *
 * @author abas Software AG
 *
 */
public class ControlPatternsForSQL {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		String inputForSQL = "%+\ttest^:\n, test09";
		System.out.println("\"" + inputForSQL + "\"");
		// removes all characters which are not alphanumeric or whitespace
		inputForSQL = inputForSQL.replaceAll("[^\\w ]", "");
		System.out.println("\"" + inputForSQL + "\"");
	}
}
