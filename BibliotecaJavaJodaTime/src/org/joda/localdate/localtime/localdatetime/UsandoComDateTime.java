package org.joda.localdate.localtime.localdatetime;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

// Usando DateTime com LocalDate, LocalDateTime e LocalTime
public class UsandoComDateTime {

	public static void main(String[] args) {
		DateTime dt = new DateTime();
		System.out.println("Data completa com timezone: " + dt.toString());

		LocalDateTime ldt = new LocalDateTime(dt);
		System.out.println("Data completa sem timezone: " + ldt.toString());

		LocalDate ld = new LocalDate(dt);
		System.out.println("Apenas data: " + ld.toString());

		LocalTime lt = new LocalTime(dt);
		System.out.println("Apenas horas, minutos, segundos e milissegundos: " + lt.toString());

	}

}
