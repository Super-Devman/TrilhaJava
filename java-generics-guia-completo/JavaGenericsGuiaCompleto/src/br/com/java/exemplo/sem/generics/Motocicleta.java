package br.com.java.exemplo.sem.generics;

public class Motocicleta extends Veiculo {

	public Motocicleta(String nome, String marca, String cor) {
		super(nome, marca, cor);
	}

	@Override
	public String listarDados() {
		return "Nome da motocicleta: " + nome + "\nMarca: " + marca + "\nCor: " + cor;
	}

}
