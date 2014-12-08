package de.abas.training.java.file;

import java.io.File;

/**
 * Shows how to work with files in Java - creating a directory hierarchy.
 *
 * @author abas Software AG
 *
 */
public class ControlFileCheckCreateFolders {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		String folder = "myfile/txt";
		File file = new File(folder);
		if (file.exists()) {
			System.out.println("Directories '" + folder + "' exist.");
		} else {
			if (file.mkdirs()) {
				System.out
						.println("Directories '" + folder + "' were created.");
			} else {
				System.out.println("Directories '" + folder
						+ "' could not be created.");
			}
		}
	}
}
