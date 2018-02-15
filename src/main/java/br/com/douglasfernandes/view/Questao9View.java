package br.com.douglasfernandes.view;

import br.com.douglasfernandes.controller.Questao9Controller;
import br.com.douglasfernandes.model.BinaryTree;

/**
 * Execu��o da solu��o da quest�o 8.
 * @author douglas.f.filho
 *
 */
public class Questao9View {
	private int soma = 0;
	
	/**
	 * M�todo que executa a solu��o da quest�o 8.
	 */
	public void run() {
		requestInput();
		
		Questao9Controller q9Controller = new Questao9Controller();
		
		BinaryTree arvore = new BinaryTree();
		arvore.setValor(10);
		
		BinaryTree no1 = new BinaryTree();
		no1.setValor(1);
		
		BinaryTree no2 = new BinaryTree();
		no2.setValor(2);
		
		arvore.setLeft(no1);
		arvore.setRight(no2);
		
		soma = q9Controller.soma(arvore);
		
		showOutput();
	}
	
	/**
	 * Solicita a entrada do usu�rio.
	 */
	private void requestInput() {
		System.out.println("Resolucao da questao 9:\n");
	}
	
	/**
	 * Mostra resultado da opera��o.
	 */
	private void showOutput() {
		System.out.println("Resultado: " + soma + "\n====================\n");
	}
	
}
