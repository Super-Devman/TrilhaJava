package br.com.java.generics.personalizados;

import java.util.ArrayList;
import java.util.List;

import br.com.java.exemplo.sem.generics.Carro;
import br.com.java.exemplo.sem.generics.Motocicleta;
import br.com.java.exemplo.sem.generics.Veiculo;
import br.com.java.generics.sistema.gerenciamento.Cacamba;

public class GerenciadorGenerico {

	public static void main(String[] args) {
		GerenciadorGenerico gerenciador = new GerenciadorGenerico();
		gerenciador.gerenciarEstabelecimentoParaVeiculos();
		gerenciador.gerenciarDepositoParaCacambas();

	}

	// Simula um sistema de gerenciamento de estacionamento
	public void gerenciarEstabelecimentoParaVeiculos() {
		System.out.println("Gerenciando um dep�sito de Ve�culos...");
		Estabelecimento<Veiculo> estacionamento = new Estabelecimento();
		adicionarVeiculos(estacionamento);
		estacionamento.listarElementos();
		removerVeiculos(estacionamento);
	}

	// Adiciona ve�culos ao estacionamento
	private void adicionarVeiculos(Estabelecimento<Veiculo> estacionamento) {
		System.out.println("Ve�culos adicionados ao Sistema...");
		Carro gol = new Carro("Gol", "Volkswagen", "Preto");
		Motocicleta ninja = new Motocicleta("Ninja", "Kawasaki", "Verde");
		Carro vectra = new Carro("Vectra", "Chevrolet", "Prata");
		estacionamento.adicionar(gol);
		estacionamento.adicionar(ninja);
		estacionamento.adicionar(vectra);
	}

	// Remove ve�culos do estabelecimento
	private void removerVeiculos(Estabelecimento<Veiculo> estacionamento) {
		List<Carro> carrosParaRemocao = new ArrayList<>();
		Carro vectra = new Carro("Vectra", "Chevrolet", "Prata");
		carrosParaRemocao.add(vectra);
		System.out.println("Veiculos removidos...");
		estacionamento.remover(carrosParaRemocao);
	}

	// Simula um sistema de gerenciamento de dep�sito de ca�ambas
	public void gerenciarDepositoParaCacambas() {
		System.out.println("Gerenciando um dep�sito de Ca�ambas");
		Estabelecimento<Cacamba> deposito = new Estabelecimento<>();
		adicionarCacambas(deposito);
		deposito.listarElementos();
		removerCacambas(deposito);
	}

	// Adiciona ca�ambas ao dep�sito
	private void adicionarCacambas(Estabelecimento<Cacamba> deposito) {
		System.out.println("Ca�ambas adicionadas ao sistema...");
		Cacamba cacambaObra1 = new Cacamba(5.0d, 7.2d, 4.5d, "Prata");
		Cacamba cacambaObra2 = new Cacamba(3.2d, 6.6d, 5.9d, "Branca");
		deposito.adicionar(cacambaObra1);
		deposito.adicionar(cacambaObra2);
	}

	// Remove ca�ambas do dep�sito
	private void removerCacambas(Estabelecimento<Cacamba> deposito) {
		List<Cacamba> cacambasParaRemocao = new ArrayList<>();
		Cacamba cacambaObra1 = new Cacamba(5.0d, 7.2d, 4.5d, "Prata");
		cacambasParaRemocao.add(cacambaObra1);
		System.out.println("Ca�ambas removidas...");
		deposito.remover(cacambasParaRemocao);
	}

}
