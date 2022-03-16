package org.joda.localdate.localtime.localdatetime;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

public class UsandoLocalDateTime {

	public static void main(String[] args) {
		LocalDateTime ldt = new LocalDateTime();
		System.out.println("LocalDateTime: " + ldt.toString());

		DateTime dt = new DateTime();
		System.out.println("DateTime: " + dt.toString());

	}

}
