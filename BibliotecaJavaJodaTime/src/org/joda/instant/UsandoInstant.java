package org.joda.instant;

import org.joda.time.DateTime;

public class UsandoInstant {

	public static void main(String[] args) {
		// No Joda-Time a classe Instant representa o instante exato em que estamos
		DateTime dt = new DateTime();
		// getYear() retorna o ano no mesmo instante através de milissegundos
		System.out.println(dt.getYear());
	}

}
