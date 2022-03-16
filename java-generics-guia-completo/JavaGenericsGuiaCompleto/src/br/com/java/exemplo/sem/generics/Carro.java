package br.com.java.exemplo.sem.generics;

public class Carro extends Veiculo {

	public Carro(String nome, String marca, String cor) {
		super(nome, marca, cor);
	}

	@Override
	public String listarDados() {
		return "Nome do carro: " + nome + "\nMarca: " + marca + "\nCor: " + cor;
	}

}
