package br.com.java.generics.sistema.gerenciamento;

import br.com.java.exemplo.sem.generics.Carro;
import br.com.java.exemplo.sem.generics.Estacionamento;
import br.com.java.exemplo.sem.generics.Motocicleta;
import br.com.java.exemplo.sem.generics.Onibus;

public class GerenciadorEstacionamento {

	Estacionamento estacionamento;

	public static void main(String[] args) {
		GerenciadorEstacionamento gerenciador = new GerenciadorEstacionamento();
		gerenciador.gerenciarEstacionamento();
	}

	private void gerenciarEstacionamento() {
		estacionamento = new Estacionamento();
		adicionarVeiculos();
		listarVeiculos();

	}

	private void adicionarVeiculos() {
		Carro gol = new Carro("Gol", "Volkswagen", "Azul");
		Carro vectra = new Carro("Vectra", "Chevrolet", "Preto");
		Motocicleta ninja = new Motocicleta("Ninja", "Kawasaki", "Verde");
		Motocicleta burgman = new Motocicleta("Burgman", "Suzuki", "Cinza");
		Onibus scania = new Onibus("Scania", "Scania", "Prata");
		estacionamento.adicionar(gol);
		estacionamento.adicionar(vectra);
		estacionamento.adicionar(ninja);
		estacionamento.adicionar(burgman);
		estacionamento.adicionar(scania);
	}

	private void listarVeiculos() {
		estacionamento.listarVeiculos();
	}

	public Estacionamento getEstacionamento() {
		return estacionamento;
	}

	public void setEstacionamento(Estacionamento estacionamento) {
		this.estacionamento = estacionamento;
	}

	private void adicionarCacamba() {
		Cacamba cacamba = new Cacamba(5.0d, 7.3d, 4.5d, "Prata");
		estacionamento.adicionar(cacamba);
	}

}
