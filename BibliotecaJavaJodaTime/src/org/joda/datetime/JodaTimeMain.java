package org.joda.datetime;

import org.joda.time.DateTime;

// Exemplo roundFloorCopy()
public class JodaTimeMain {

	public static void main(String[] args) {
		DateTime dt = new DateTime();
		DateTime rounded = dt.dayOfMonth().roundFloorCopy();
		System.out.println("Antes: " + dt.toString());
		System.out.println("Depois: " + rounded.toString());
	}

}
