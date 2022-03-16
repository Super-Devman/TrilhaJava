package br.com.java.classes.interfaces;

public class Fatura implements Pagavel {
	private Fornecedor fornecedor;
	private double valor;

	public Fatura() {

	}

	public Fatura(Fornecedor fornecedor, double valor) {
		this.fornecedor = fornecedor;
		this.valor = valor;
	}

	public final Fornecedor getFornecedor() {
		return fornecedor;
	}

	public final void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public double getValorPagar() {
		return this.valor;
	}

}
