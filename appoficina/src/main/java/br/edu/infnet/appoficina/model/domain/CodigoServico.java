package br.edu.infnet.appoficina.model.domain;

public enum CodigoServico {
	Higienizacao("001"),
	Pintura("002"),
	Mecanica("003");
	
    private String name;

    private CodigoServico(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
