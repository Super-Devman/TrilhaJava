package org.joda.datetime;

import java.util.Date;

import org.joda.time.DateTime;

public class DateTimeImutavel {

	public static void main(String[] args) {
		Date javaUtilDate = new Date();
		DateTime dt = new DateTime(javaUtilDate);
		// Método withYear irá usar a data configurada para criar uma nova data com o
		// ano 2000
		DateTime year2000 = dt.withYear(2000);
		// plusHours usa a data configurada para criar uma nova data adicionando + 2
		// horas
		DateTime twoHoursLater = dt.plusHours(2);

		/*
		 * Obs: Ao chamar os 2 métodos acima é atribuido um novo objeto DateTime, já que
		 * isso possibilita recuperar a data original sem nenhuma alteração
		 */

		System.out.println("Nova data: " + year2000);
		System.out.println("Duas horas depois: " + twoHoursLater);

	}

}
