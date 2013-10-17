package spai.egit2.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import spai.egit2.NumeroEntero;

public class NumeroEnteroTest {
    private NumeroEntero numero;

    @Before
    public void initObjects() {
        this.numero = new NumeroEntero(100);
    }

    @Test
    public void testConstructorSinParametros() {
        NumeroEntero numero = new NumeroEntero();
        assertEquals(0, numero.getValor());
    }
    
    @Test
    public void testConstructorConParametros() {
        NumeroEntero numero = new NumeroEntero(-10);
        assertEquals(-10, numero.getValor());
    }

    @Test
    public void testIncrementar() {
        this.numero.incrementar();
        assertEquals(101, this.numero.getValor());
    }

    @Test
    public void testDoblar() {
        this.numero.doblar();
        assertEquals(200, this.numero.getValor());
    }

    @Test
    public void testDecrementar() {
        this.numero.decrementar();
        assertEquals(99, numero.getValor());
        numero = new NumeroEntero();
        this.numero.decrementar();
        assertEquals(-1, numero.getValor());
    }
    
    @Test
    public void testIncrementarConValor(){
    	this.numero.incrementar(15);
    	assertEquals(25, this.numero.getValor());
    	numero = new NumeroEntero(11);
    	this.numero.incrementar(9);
    	assertEquals(20, this.numero.getValor());
    }
    
    @Test
    public void testMultiplicarConValor(){
    	this.numero.multiplicar(5);
    	assertEquals(500, this.numero.getValor());
    	numero = new NumeroEntero(11);
    	this.numero.multiplicar(5);
    	assertEquals(55, this.numero.getValor());
    }

}
