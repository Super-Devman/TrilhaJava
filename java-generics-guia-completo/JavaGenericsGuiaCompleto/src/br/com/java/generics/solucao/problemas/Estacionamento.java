package br.com.java.generics.solucao.problemas;

import java.util.ArrayList;
import java.util.List;

import br.com.java.exemplo.sem.generics.Veiculo;

// Classe definida com Generics para manipula��o de objetos de um �nico tipo
public class Estacionamento {

	private String nome;
	private String localizacao;
	// Lista parametrizada para realizar SOMENTE opera��es com objetos do tipo
	// Veiculo
	private List<Veiculo> veiculos;

	public Estacionamento() {
		veiculos = new ArrayList<>();
	}

	// Obs: Com Generics, deve-se inserir SOMENTE Objetos da hierarquia definida
	// nesse caso Veiculo
	public void adicionar(Veiculo veiculo) {
		veiculos.add(veiculo);
	}

	// Obs2: Com Generics, apenas objetos do tipo Veiculo ter�o seus dados listados
	public void listarVeiculos() {
		for (Veiculo veiculo : veiculos) {
			veiculo.listarDados();
		}
	}
}
