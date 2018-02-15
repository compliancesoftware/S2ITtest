package br.com.douglasfernandes.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class Questao8ControllerTest {

	@Test
	public void testResult() {
		int desiredValue = 1324;
		
		int A = 12;
		int B = 34;
		
		int computedValue = new Questao8Controller().result(A, B);
		
		assertEquals(desiredValue, computedValue);
	}

}
