package br.com.douglasfernandes.view;

import java.util.Scanner;

import br.com.douglasfernandes.controller.Questao8Controller;

/**
 * Execu��o da solu��o da quest�o 8.
 * @author douglas.f.filho
 *
 */
public class Questao8View {
	private int A = 0;
	private int B = 0;
	private int C = -1;
	/**
	 * M�todo que executa a solu��o da quest�o 8.
	 */
	public void run() {
		requestInput();
		
		Questao8Controller q8Controller = new Questao8Controller();
		C = q8Controller.result(A, B);
		
		showOutput();
	}
	
	/**
	 * Solicita a entrada do usu�rio.
	 */
	private void requestInput() {
		System.out.println("Resolucao da questao 8:\n");
		System.out.println("Digite o valor do numero inteiro A: ");
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		
		System.out.println("Digite o valor do numero inteiro B: ");
		
		B = sc.nextInt();
		
		sc.close();
	}
	
	/**
	 * Mostra resultado da opera��o.
	 */
	private void showOutput() {
		System.out.println("Resultado: " + C + "\n====================\n");
	}
	
}
