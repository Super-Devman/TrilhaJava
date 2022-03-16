package br.com.java.exemplo.sem.generics;

import java.util.ArrayList;
import java.util.List;

import br.com.java.exemplo.sem.generics.Veiculo;

public class Estacionamento {

	private String nome;
	private String localizacao;
	private List veiculos;

	public Estacionamento() {
		veiculos = new ArrayList();
	}

	public void adicionar(Object o) {
		veiculos.add(o);
		System.out.println("Adicionado ao estacionamento: " + o.toString() + "\n");
	}

	public void listarVeiculos() {
		for (Object object : veiculos) {
			Veiculo veiculo = (Veiculo) object;
			System.out.println(veiculo.listarDados());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public List getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List veiculos) {
		this.veiculos = veiculos;
	}

}
