package de.abas.training.java.file;

import java.io.File;

/**
 * Shows how to work with files in Java - checking whether a directory exists
 * and creating a directory.
 *
 * @author abas Software AG
 *
 */
public class ControlFileCheckCreateFolder {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		String folder = "myfiles";
		File file = new File(folder);

		if (file.exists()) {
			System.out.println("Directory '" + folder + "' exists");
		} else {
			if (file.mkdir()) {
				System.out.println("Directory '" + folder + "' was created");
			} else {
				System.out.println("Directory '" + folder
						+ "' could not be created");
			}
		}
	}
}
