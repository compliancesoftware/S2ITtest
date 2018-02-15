package br.com.douglasfernandes;

import br.com.douglasfernandes.view.Questao8View;
import br.com.douglasfernandes.view.Questao9View;

/**
 * Classe onde são executados os testes.
 * @author douglas.f.filho
 *
 */
public class S2ITtests {
	/**
	 * Método chamado na execução da aplicação.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Questao8View q8View = new Questao8View();
		q8View.run();
		
		Questao9View q9View = new Questao9View();
		q9View.run();
	}
}
