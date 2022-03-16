package org.joda.localdate.localtime.localdatetime;

import org.joda.time.DateTime;
import org.joda.time.LocalTime;

public class UsandoLocalTime {

	public static void main(String[] args) {
		LocalTime lt = new LocalTime();
		System.out.println("LocalTime: " + lt.toString());
		
		DateTime dt = new DateTime();
		System.out.println("DateTime: " + dt.toString());

	}

}
