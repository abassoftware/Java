package de.abas.training.java.arrays;

/**
 * Shows usage of Arrays and introduces multidimensional Arrays.
 *
 * @author abas Software AG
 *
 */
public class ControlArrays {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// initializing an Array
		String[] firstArray = new String[10];
		String[] secondArray = { "one", "two", "three", "four" };

		// prints content of firstArray and secondArray
		for (String item : firstArray) {
			System.out.println(item);
		}
		for (String item : secondArray) {
			System.out.println(item);
		}

		// two-dimensional Array table example
		double[][] table = new double[5][4];
		// initialize table
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.println(i + " - " + j);
				table[i][j] = i + j;
			}
		}

		System.out.println("----------------------");
		// print table
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.println("z" + i + "|s" + j + " -> " + table[i][j]);
			}
		}
	}
}
