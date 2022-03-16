package org.joda.datetime;

import java.util.Date;

import org.joda.time.DateTime;

public class UsandoDateTime {

	public static void main(String[] args) {
		Date javaUtilDate = new Date();
		DateTime dt = new DateTime(javaUtilDate);
		int month = dt.getMonthOfYear();
		int year = dt.getYear();
		
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);

	}

}
