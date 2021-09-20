package org.formacion.factorymethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLavadora {
protected CrearLavadoras Factoria;
	@Test
	public void test_carga_frontal() {
		Factoria = new FactLavadoraFrontal();
		Lavadora lavadora = Factoria.crearLavadora();
		lavadora.ponerMandos();
		lavadora.ponerTambor();
		
		assertEquals("frontal", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

	@Test
	public void test_carga_superior() {
		Factoria = new FactLavadoraSuperior();
		Lavadora lavadora = Factoria.crearLavadora();
		lavadora.ponerMandos();
		lavadora.ponerTambor();
		
		assertEquals("superior", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

}
