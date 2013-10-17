package spai.egit2.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import spai.egit2.Persona;

public class PersonaTest {
    private Persona persona;

    @Before
    public void initObjects() {
        this.persona = new Persona("Ana ", "Vega");
    }

    @Test
    public void testGetNombre() {
        assertEquals("Ana", this.persona.getNombre());
    }

    @Test
    public void testSetNombre() {
        this.persona.setNombre(" ana ");
        assertEquals("Ana", this.persona.getNombre());
    }

    @Test
    public void testGetApellido() {
        assertEquals("Vega", this.persona.getApellido());
    }

    @Test
    public void testSetApellido() {
        this.persona.setApellido("  vega  ");
        assertEquals("Vega", this.persona.getApellido());
    }

    @Test
    public void testInicial() {
        assertEquals("A.", this.persona.inicial());
    }

    @Test
    public void testNombreCompleto() {
        assertEquals("Ana Vega", this.persona.nombreCompleto());
    }
    
    @Test
    public void testValidaDni() {
    	assertTrue(Persona.validaDni("12345678Z"));
    }
    
    @Test
    public void testIniciales() {
        assertEquals("AV.", this.persona.iniciales());
    }
}
