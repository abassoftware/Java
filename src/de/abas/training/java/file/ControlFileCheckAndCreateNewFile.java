package de.abas.training.java.file;

import java.io.File;
import java.io.IOException;

/**
 * Shows how to work with files in Java - checking whether file exists and
 * creating file.
 *
 * @author abas Software AG
 *
 */
public class ControlFileCheckAndCreateNewFile {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("myfile/txt/VehicleNew.txt");
		if (file.exists()) {
			System.out.println("File '" + file + "' already exists.");
		} else {
			System.out.println("File '" + file
					+ "' does not exist and will be created.");
			try {
				if (file.createNewFile()) {
					System.out.println("File '" + file + "' was created");
				}
			} catch (IOException e) {
				System.out
				.println("A problem occurred while trying to create the file: "
						+ file);
			}
		}

	}

}
