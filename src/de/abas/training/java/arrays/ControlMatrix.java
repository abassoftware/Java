package de.abas.training.java.arrays;

/**
 * Shows usage of multidimensional Arrays using the example of a three-dimensional matrix.
 * 
 * @author abas Software AG.
 *
 */
public class ControlMatrix {
	
	/**
	 * Method to start the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[][][] matrix = new int[3][4][5];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				for (int k = 0; k < matrix[i][j].length; k++) {
					System.out.println("z"+i+"s"+j+"t"+k);
					matrix[i][j][k] = i+j+k;
				}
			}
		}
		System.out.println("------------------------");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				for (int k = 0; k < matrix[i][j].length; k++) {
					System.out.println("z"+i+"s"+j+"t"+k+ "->"+matrix[i][j][k]);
					
				}
			}
		}
	}
}
