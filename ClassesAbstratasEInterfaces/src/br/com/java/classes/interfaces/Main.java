package br.com.java.classes.interfaces;

// Programa para calcular o total a pagar
public class Main {

	public static void main(String[] args) {

		ContasPagar contas = new ContasPagar();
		Empregado e = new Empregado("João", null, 750.0);
		Fatura f = new Fatura(new Fornecedor("Casa do computador", null), 3000.00);
		contas.adicionar(e);
		contas.adicionar(f);
		System.out.println("Pagamento total: " + contas.calcularPagamentoTotal());
	}

}
