package br.ufrn.imd.banco.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAgenciaModel {
	
	Agencia agenciaTeste = new Agencia();
	
	@Test
	public void testGetId() {
		agenciaTeste.setId(20);
		assertEquals(agenciaTeste.getId(),20);
	}
	
	@Test
	public void testSetId() {
		agenciaTeste.setId(10);
		assertEquals(agenciaTeste.getId(),10);
	}
	
	@Test
	public void testGetNumero() {
		agenciaTeste.setNumero(50.0);
		assertEquals(agenciaTeste.getNumero(),50.0,0.1);
	}
	
	@Test
	public void testSetNumero() {
		agenciaTeste.setNumero(100.0);
		assertEquals(agenciaTeste.getNumero(),100.0,0.1);
	}


}
