package br.com.java.classes.interfaces;

public class Empregado extends Pessoa implements Pagavel {
	private double salario;

	public Empregado() {
	}

	public Empregado(String nome, String endereco, double salario) {
		super(nome, endereco);
		this.salario = salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Implementação do método abstrato declarado na interface Pagavel
	@Override
	public double getValorPagar() {
		return this.salario;
	}

}
