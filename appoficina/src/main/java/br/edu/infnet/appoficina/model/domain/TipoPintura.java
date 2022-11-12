package br.edu.infnet.appoficina.model.domain;

public enum TipoPintura {
	Solida("Sólida"), Metalica("Metálica"), Perolizada("Perolizada");

	private String name;

	private TipoPintura(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
