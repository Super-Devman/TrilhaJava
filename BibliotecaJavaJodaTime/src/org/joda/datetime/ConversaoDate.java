package org.joda.datetime;

import java.util.Date;

import org.joda.time.DateTime;

// Convertendo Date para DateTime do Joda-Time
public class ConversaoDate {

	public static void main(String[] args) {
		Date javaUtilDate = new Date();
		DateTime dt = new DateTime(javaUtilDate);
		
		System.out.println(dt);

	}

}
