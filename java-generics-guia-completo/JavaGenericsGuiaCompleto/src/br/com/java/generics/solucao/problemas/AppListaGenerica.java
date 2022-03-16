package br.com.java.generics.solucao.problemas;

import java.util.ArrayList;
import java.util.List;

// Exemplifica a criação de uma lista para manipulação apenas de objetos do tipo String
public class AppListaGenerica {

	// Lista com o tipo parametrizado String
	private List<String> listaCidades;

	public static void main(String[] args) {
		AppListaGenerica exemploListaGenerica = new AppListaGenerica();
		exemploListaGenerica.inserirCidades();
		exemploListaGenerica.listarCidades();
	}

	public AppListaGenerica() {
		listaCidades = new ArrayList<String>();
	}

	// Insere nome de cidades na listaCidades
	private void inserirCidades() {
		listaCidades.add("São Paulo");
		listaCidades.add("Belo Horizonte");
		listaCidades.add("Olinda");
	}

	// Lista o nome das cidades armazenadas no objeto listaCidades
	private void listarCidades() {
		for (String cidade : listaCidades) {
			System.out.println("Nome da cidade: " + cidade);
		}
	}

}
