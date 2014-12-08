package de.abas.training.java.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Shows how to work with dates in Java.
 *
 * @author abas Software AG
 *
 */
public class ControlCalculateDate {

	/**
	 * Method to start the program.
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		Date date = new Date();
		System.out.println("Current date:  " + date);

		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL,
				Locale.GERMANY);
		System.out.println("German format:    " + dateFormat.format(date));

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy",
				Locale.GERMANY);
		System.out.println("Simple format: " + simpleDateFormat.format(date));

		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTime(date);

		int year = gregorianCalendar.get(GregorianCalendar.YEAR);
		int month = gregorianCalendar.get(GregorianCalendar.MONTH);
		int day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);

		System.out.println("Year: " + year);
		System.out.println("Month: " + month);
		System.out.println("Day: " + day);

		// calculates warranty date
		// warrant: 2 years (the first day of the next month)
		int nextMonth = month + 1;
		int firstDayOfMonth = 1;
		int newYear = year + 2;

		System.out.println("----------------------------");
		GregorianCalendar newGregorianCalendar = new GregorianCalendar(newYear,
				nextMonth, firstDayOfMonth);
		Date newDate = newGregorianCalendar.getTime();
		System.out
				.println("Simple format: " + simpleDateFormat.format(newDate));

		simpleDateFormat = new SimpleDateFormat("dd.MMMM.yyyy", Locale.GERMANY);
		System.out.println("Simple format: " + simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("d.MMM.yyy", Locale.GERMANY);
		System.out.println("Simple format: " + simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("d.MM.yy", Locale.GERMANY);
		System.out.println("Simple format: " + simpleDateFormat.format(date));
	}
}
