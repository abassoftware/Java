package de.abas.training.java.write.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Shows how to read files.
 *
 * @author abas Software AG
 *
 */
public class ControlWriteFile {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
					"files/Vehicles.txt", true));

			writeFile(bufferedWriter,
					"vehicleSequenceNumber;color;length;salesPrice");
			writeFile(bufferedWriter, "2001_001;yellow;4.9;13000.00");
			writeFile(bufferedWriter, "2001_002;black;4.5;14000.00");
			writeFile(bufferedWriter, "2001_003;yellow;4.1;20000.00");
			writeFile(bufferedWriter, "2001_004;blue;3.95;27000.00");

			bufferedWriter.close();
			System.out.println("file written");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Inserts line and line break into file.
	 *
	 * @param bufferedWriter The BufferedWriter instance.
	 * @param write String object to write.
	 * @throws IOException Thrown if an error occurs.
	 */
	private static void writeFile(BufferedWriter bufferedWriter, String write)
			throws IOException {
		bufferedWriter.write(write);
		bufferedWriter.newLine();
	}
}
