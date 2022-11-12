package br.edu.infnet.appoficina.model.domain;

public enum TipoHigienizacao {
	Aspiracao("Aspiração"),
	EscovacaoTeto("Escovação do Teto"),
	LimpezaVidro("Limpeza de vidro"),
	Completa("Complete");
	
    private String name;

    private TipoHigienizacao(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
