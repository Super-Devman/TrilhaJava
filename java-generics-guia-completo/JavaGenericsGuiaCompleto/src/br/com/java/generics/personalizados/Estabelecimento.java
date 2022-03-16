package br.com.java.generics.personalizados;

import java.util.ArrayList;
import java.util.List;

// Aqui será mostrado como criar e gerenciar os nossos próprios tipos genéricos
public class Estabelecimento<E> {

	private List<E> elementos;

	public Estabelecimento() {
		elementos = new ArrayList<>();
	}

	// Adiciona um elemento genérico à lista de elementos
	public void adicionar(E elemento) {
		elementos.add(elemento);
	}

	// Lista os dados armazenados em elementos
	public void listarElementos() {
		for (E elemento : elementos) {
			System.out.println(elemento.toString());
		}
	}

	// Remove a lista de objetos passada por parâmetro na lista de elementos
	public void remover(List<? extends E> elementosParaRemocao) {
		elementos.removeAll(elementosParaRemocao);
		for (E elementoRemovido : elementosParaRemocao) {
			System.out.println(elementoRemovido.toString());
		}
	}
}
