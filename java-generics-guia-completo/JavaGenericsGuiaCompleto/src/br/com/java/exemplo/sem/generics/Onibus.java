package br.com.java.exemplo.sem.generics;

public class Onibus extends Veiculo {

	public Onibus(String nome, String marca, String cor) {
		super(nome, marca, cor);
	}

	@Override
	public String listarDados() {
		return "Nome da ônibus: " + nome + "\nMarca: " + marca + "\nCor: " + cor;
	}

}
