package br.ufrn.imd.banco.model;

import java.util.Random;

public class Agencia {
	
	private static long agenciaId = 1;

	private long id;
	
	private Double numero;

	private Random gerador = new Random();
	
	public Agencia() {
		super();
		this.id = Agencia.agenciaId; 
		Agencia.agenciaId++;
		this.numero = gerador.nextDouble();
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getNumero() {
		return numero;
	}

	public void setNumero(Double numero) {
		this.numero = numero;
	}

}
