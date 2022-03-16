package org.joda.instant;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.CopticChronology;


public class UsandoChronology {

	public static void main(String[] args) {

		DateTimeZone zone = DateTimeZone.forID("Europe/London");
		// A classe Chronology é usada para retornar um calendário desejado.
		Chronology coptic = CopticChronology.getInstance(zone);

		DateTime dt = new DateTime(coptic);

		int year = dt.getYear();
		int month = dt.getMonthOfYear();
		System.out.println(year);
		System.out.println(month);

	}

}
