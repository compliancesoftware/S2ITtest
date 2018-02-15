package br.com.douglasfernandes.controller;

import br.com.douglasfernandes.model.BinaryTree;

/**
 * Resolução da proposta 9
 * @author douglas.f.filho
 *
 */
public class Questao9Controller {
	
	/**
	 * Dado o nó de uma árvore binária, calcule a soma de todos os nós subsequentes.
	 * @param no = Nó
	 * @return Soma dos nós
	 */
	public int soma(BinaryTree no) {
		int valorLeft = 0;
		int valorRight = 0;
		int valor = no.getValor();
		
		if(no.getLeft() != null) {
			valorLeft = soma(no.getLeft());
		}
		if(no.getRight() != null) {
			valorRight = soma(no.getRight());
		}
		
		return valor + valorLeft + valorRight;
	}
	
}
