package org.joda.formatacao.datas;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class UsandoDateTimeFormat {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		// forPattern() passa o padrão de data desejado para essa classe
		DateTimeFormatter dtf = DateTimeFormat.forPattern("d MMMM, yyyy");
		String str = date.toString(dtf);
		System.out.println(str);

	}

}
