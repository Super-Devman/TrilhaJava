package br.com.java.generics.personalizados;

import java.util.ArrayList;
import java.util.List;

// Aqui ser� mostrado como criar e gerenciar os nossos pr�prios tipos gen�ricos
public class Estabelecimento<E> {

	private List<E> elementos;

	public Estabelecimento() {
		elementos = new ArrayList<>();
	}

	// Adiciona um elemento gen�rico � lista de elementos
	public void adicionar(E elemento) {
		elementos.add(elemento);
	}

	// Lista os dados armazenados em elementos
	public void listarElementos() {
		for (E elemento : elementos) {
			System.out.println(elemento.toString());
		}
	}

	// Remove a lista de objetos passada por par�metro na lista de elementos
	public void remover(List<? extends E> elementosParaRemocao) {
		elementos.removeAll(elementosParaRemocao);
		for (E elementoRemovido : elementosParaRemocao) {
			System.out.println(elementoRemovido.toString());
		}
	}
}
