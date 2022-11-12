package br.edu.infnet.appoficina.model.domain;

public enum TipoMassaAplicada {
	Acrilica("Acrílica"), Poliester("Poliéster"), Plastica("Plástica");

	private String name;

	private TipoMassaAplicada(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
