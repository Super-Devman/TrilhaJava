package br.com.java.classes.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class ContasPagar {
	private ArrayList<Pagavel> contas = new ArrayList<Pagavel>();

	public void adicionar(Pagavel p) {
		contas.add(p);
	}

	public double calcularPagamentoTotal() {
		double total = 0;
		Pagavel p;
		Iterator<Pagavel> itr = contas.iterator();
		while (itr.hasNext()) {
			p = itr.next();
			total += p.getValorPagar();
		}

		return total;
	}
}
