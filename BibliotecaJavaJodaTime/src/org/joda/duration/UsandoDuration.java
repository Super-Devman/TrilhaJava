package org.joda.duration;

import org.joda.time.DateTime;
import org.joda.time.Duration;

// Usando a classe Duration para retornar a quantidade de dias
public class UsandoDuration {

	public static void main(String[] args) {
		DateTime start = new DateTime(2015, 01, 10, 0, 0, 0, 0);
		DateTime end = new DateTime(2015, 01, 15, 0, 0, 0, 0);

		// A classe Duration � capaz de medir a dura��o entre determinados per�odos
		// atrav� do Instant
		// em millisegundos
		Duration duration = new Duration(start, end);
		// getStandardDays() solicita a quantidade de dias que h� entre as duas datas
		// acima
		System.out.println(duration.getStandardDays());

	}

}
