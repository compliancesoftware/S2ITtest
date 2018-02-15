package br.com.douglasfernandes.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.douglasfernandes.model.BinaryTree;

public class Questao9ControllerTest {

	@Test
	public void testSoma() {
		Questao9Controller q9Controller = new Questao9Controller();
		
		BinaryTree arvore = new BinaryTree();
		arvore.setValor(10);
		
		BinaryTree no1 = new BinaryTree();
		no1.setValor(1);
		
		BinaryTree no1DoNo1 = new BinaryTree();
		no1DoNo1.setValor(4);
		no1.setLeft(no1DoNo1);
		
		BinaryTree no2DoNo1 = new BinaryTree();
		no2DoNo1.setValor(3);
		no1.setRight(no2DoNo1);
		
		BinaryTree no2 = new BinaryTree();
		no2.setValor(2);
		
		arvore.setLeft(no1);
		arvore.setRight(no2);
		
		int soma = q9Controller.soma(arvore);
		
		int desiredValue = 20;
		
		assertEquals(desiredValue, soma);
	}

}
