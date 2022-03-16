package construtor.primeiros.passos;

public class Carro {

	private String cor;
	private double preco;
	private String modelo;

	// CONSTRUTOR PADRÃO
	public Carro() {

	}

	// CONSTRUTOR COM 2 PARÂMETROS
	public Carro(String modelo, double preco) {
		/*
		 * Obs: Se for escolhido o construtor sem a COR do veículo será definido a cor
		 * padrão como sendo PRETA
		 */
		this.cor = "PRETA";
		this.modelo = modelo;
		this.setPreco(preco);
	}

	// CONSTRUTOR COM 3 PARÂMETROS
	public Carro(String cor, String modelo, double preco) {
		this.cor = cor;
		this.setPreco(preco);
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public final String getCor() {
		return cor;
	}

	public final void setCor(String cor) {
		this.cor = cor;
	}

	public final String getModelo() {
		return modelo;
	}

	public final void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
