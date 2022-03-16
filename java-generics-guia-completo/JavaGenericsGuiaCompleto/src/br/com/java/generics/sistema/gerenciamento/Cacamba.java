package br.com.java.generics.sistema.gerenciamento;

public class Cacamba {

	private double comprimento;
	private double largura;
	private double profundidade;
	private String cor;

	public Cacamba(double comprimento, double largura, double profundidade, String cor) {
		super();
		this.comprimento = comprimento;
		this.largura = largura;
		this.profundidade = profundidade;
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Cacamba [comprimento=" + comprimento + ", largura=" + largura + ", profundidade=" + profundidade
				+ ", cor=" + cor + "]";
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
