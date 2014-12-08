package de.abas.training.java.file;

import java.io.File;

/**
 * Show how to work with files in Java - set a file to be read only.
 *
 * @author abas Software AG
 *
 */
public class ControlFileSetFileReadOnly {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("myfile/txt/VehicleNew.txt");
		if (file.exists()) {
			System.out.println("File '" + file + "' exists -> set read only");
			file.setReadOnly();
		} else {
			System.out.println("File '" + file
					+ "' does not exist and will be created");
		}
	}
}
