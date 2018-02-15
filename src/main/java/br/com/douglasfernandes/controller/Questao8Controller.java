package br.com.douglasfernandes.controller;

/**
 * Resolu��o da proposta 8
 * @author douglas.f.filho
 *
 */
public class Questao8Controller {
	
	/**
	 * <p>Dados dois n�meros inteiros A e B, cria um terceiro n�mero inteiro C que representa a uni�o de A e B seguindo
	 * as seguintes regras:</p>
	 * <ul>
	 * 	<li>O primeiro n�mero de C � o primeiro n�mero de A;</li>
	 * 	<li>O segundo n�mero de C � o primeiro n�mero de B;</li>
	 * 	<li>O terceiro n�mero de C � o segundo n�mero de A;</li>
	 * 	<li>O quarto n�mero de C � o segundo n�mero de B;</li>
	 * 	<li>Assim sucessivamente�</li>
	 * 	<li>Caso os n�meros de A ou B sejam de tamanhos diferentes, 
	 * 		completar C com o restante dos n�meros do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.</li>
	 * 	<li>Caso C seja maior que 1.000.000, retornar -1</li>
	 * </ul>
	 * @param A = primeiro n�mero inteiro.
	 * @param B = segundo n�mero inteiro.
	 * @return terceiro n�mero inteiro como resultado da uni�o, ou -1 caso o resultado do c�lculo 
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
