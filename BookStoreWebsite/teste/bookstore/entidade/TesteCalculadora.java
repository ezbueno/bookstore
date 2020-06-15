package bookstore.entidade;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculadora {

	@Test
	public void testAdicionar() {
		Calculadora calculadora = new Calculadora();
		
		int a = 1234;
		int b = 5678;
		
		int resultado = calculadora.adicionar(a, b);
		
		int esperado = 6912;
		
		assertEquals(esperado, resultado);
	}

}
