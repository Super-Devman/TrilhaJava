package org.joda.datetime;

import java.util.Locale;

import org.joda.time.DateTime;

public class UsandoProperty {

	public static void main(String[] args) {
		DateTime dt = new DateTime();
		// getAsText() retorna o nome do m�s por extenso
		String monthName = dt.monthOfYear().getAsText();
		// getAsShortText() retorna o m�s novamente mas em franc�s
		String frenchShortName = dt.monthOfYear().getAsShortText(Locale.FRENCH);
		// isLeap() verifica se o ano � bissexto
		boolean isLeapYear = dt.year().isLeap();
		// roundFloorCopy() arredonda o valor para "baixo"
		DateTime round = dt.dayOfMonth().roundFloorCopy();
		System.out.println("M�s atual: " + monthName);
		System.out.println("M�s em franc�s: " + frenchShortName);
		System.out.println("Esse ano � bissexto? " + isLeapYear);
		System.out.println(round);

	}

}
