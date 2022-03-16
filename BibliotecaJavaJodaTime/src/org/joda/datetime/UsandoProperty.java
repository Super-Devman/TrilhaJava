package org.joda.datetime;

import java.util.Locale;

import org.joda.time.DateTime;

public class UsandoProperty {

	public static void main(String[] args) {
		DateTime dt = new DateTime();
		// getAsText() retorna o nome do mês por extenso
		String monthName = dt.monthOfYear().getAsText();
		// getAsShortText() retorna o mês novamente mas em francês
		String frenchShortName = dt.monthOfYear().getAsShortText(Locale.FRENCH);
		// isLeap() verifica se o ano é bissexto
		boolean isLeapYear = dt.year().isLeap();
		// roundFloorCopy() arredonda o valor para "baixo"
		DateTime round = dt.dayOfMonth().roundFloorCopy();
		System.out.println("Mês atual: " + monthName);
		System.out.println("Mês em francês: " + frenchShortName);
		System.out.println("Esse ano é bissexto? " + isLeapYear);
		System.out.println(round);

	}

}
