package br.edu.infnet.appoficina.model.domain;

public enum TipoVeiculo {
	Moto("Moto"), Carro("Carro"), Caminhao("Caminhão");

	private String name;

	private TipoVeiculo(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
