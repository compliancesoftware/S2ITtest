package br.com.douglasfernandes.controller;

/**
 * Resolução da proposta 8
 * @author douglas.f.filho
 *
 */
public class Questao8Controller {
	
	/**
	 * <p>Dados dois números inteiros A e B, cria um terceiro número inteiro C que representa a união de A e B seguindo
	 * as seguintes regras:</p>
	 * <ul>
	 * 	<li>O primeiro número de C é o primeiro número de A;</li>
	 * 	<li>O segundo número de C é o primeiro número de B;</li>
	 * 	<li>O terceiro número de C é o segundo número de A;</li>
	 * 	<li>O quarto número de C é o segundo número de B;</li>
	 * 	<li>Assim sucessivamente…</li>
	 * 	<li>Caso os números de A ou B sejam de tamanhos diferentes, 
	 * 		completar C com o restante dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.</li>
	 * 	<li>Caso C seja maior que 1.000.000, retornar -1</li>
	 * </ul>
	 * @param A = primeiro número inteiro.
	 * @param B = segundo número inteiro.
	 * @return terceiro número inteiro como resultado da união, ou -1 caso o resultado do cálculo 
	 * seja superior a 1.000.000
	 */
	public int result(int A, int B) {
		int limite = 1000000;
		
		String numeroA = "" + A;
		String numeroB = "" + B;
		
		String C = "";
		
		int index = 0;
		char[] arrayDeChars = numeroA.toCharArray();
		
		for(char c : arrayDeChars) {
			C += c;
			if(index < numeroB.length()) {
				C += numeroB.charAt(index);
			}
			
			index++;
		}
		
		String restante = (A >= B ? numeroA : numeroB);
		restante = restante.substring(index);
		
		C += restante;
		
		int resultado = -1;
		
		try {
			resultado = Integer.parseInt(C);
		} catch(Exception e) {
			resultado = -1;
		}
		
		if(resultado > limite) {
			resultado = -1;
		}
		
		return resultado;
	}
	
}
