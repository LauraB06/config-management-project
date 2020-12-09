package br.ufrn.imd.banco.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteContaModel {
	Agencia agencia = new Agencia();
	Conta contaTeste = new Conta();
	


	@Test
	public void testSetId() {
		contaTeste.setId(10);
		assertEquals(contaTeste.getId(),10);
	}

	@Test
	public void testGetAgencia() {
		contaTeste.setAgencia(agencia);
		assertEquals(contaTeste.getAgencia(),agencia);
	}

	@Test
	public void testSetAgencia() {
		Agencia agencia2 = new Agencia();
		contaTeste.setAgencia(agencia2);
		assertEquals(contaTeste.getAgencia(),agencia2);
	}

	@Test
	public void testGetSaldo() {
		contaTeste.setSaldo(0.0);
		assertEquals(contaTeste.getSaldo(),0.0,0.1);
	}

	@Test
	public void testSetSaldo() {
		contaTeste.setSaldo(2.0);
		assertEquals(contaTeste.getSaldo(),2.0,0.1);
	}

	@Test
	public void testGetSaldoBonus() {
		contaTeste.setSaldoBonus(0.0);
		assertEquals(contaTeste.getSaldoBonus(),0.0,0.1);
	}

	@Test
	public void testSetSaldoBonus() {
		contaTeste.setSaldoBonus(2.0);
		assertEquals(contaTeste.getSaldoBonus(),2.0,0.1);
	}

}
