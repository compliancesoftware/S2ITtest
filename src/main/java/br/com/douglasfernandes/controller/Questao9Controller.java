package br.com.douglasfernandes.controller;

import br.com.douglasfernandes.model.BinaryTree;

/**
 * Resolu��o da proposta 9
 * @author douglas.f.filho
 *
 */
public class Questao9Controller {
	
	/**
	 * Dado o n� de uma �rvore bin�ria, calcule a soma de todos os n�s subsequentes.
	 * @param no = N�
	 * @return Soma dos n�s
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
