package br.com.java.exemplo.sem.generics;

public abstract class Veiculo {

	protected String nome;
	protected String marca;
	protected String cor;

	public Veiculo(String nome, String marca, String cor) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
	}

	public abstract String listarDados();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
