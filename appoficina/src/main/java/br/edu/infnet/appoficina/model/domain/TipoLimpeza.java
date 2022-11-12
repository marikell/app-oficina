package br.edu.infnet.appoficina.model.domain;

public enum TipoLimpeza {
	Leve("Leve"), 
	Media("Média"), 
	Intensa("Intensa");
	
    private String name;

    private TipoLimpeza(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
