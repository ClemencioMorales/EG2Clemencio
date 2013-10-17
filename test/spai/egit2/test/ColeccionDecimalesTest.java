package spai.egit2.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import spai.egit2.ColeccionDecimales;

public class ColeccionDecimalesTest {
	private ColeccionDecimales numeros;

	@Before
	public void initObjects() {
		double[] coleccion = { 1.2, 3.4, 1.2 };
		this.numeros = new ColeccionDecimales(coleccion);
	}

	@Test
	public void testSuma() {
		assertEquals(5.8, this.numeros.suma(), 1e-10);
	}

	@Test
	public void testMayor() {
		assertEquals(3.4, this.numeros.mayor(), 1e-10);
	}
}
