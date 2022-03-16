package org.joda.localdate.localtime.localdatetime;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

//As classes LocalDate, LocalTime e LocalDatetime representam datas de uma forma mais simplista
public class UsandoLocalDate {

	public static void main(String[] args) {
		LocalDate ld = new LocalDate();
		System.out.println("LocalDate: " + ld.toString());

		DateTime dt = new DateTime();
		System.out.println("DateTime: " + dt.toString());

	}

}
