package br.edu.infnet.appoficina.model.domain;

public enum TipoManutencao {
	SistemaSuspensaoRodas("Sistema de suspensão de rodas"),
	SistemaFreios("Sistema de freios"),
	SistemaDirecao("Sistema de direção"),
	SistemaTransmissaoMecanica("Sistema de transmissão Mecânica"),
	Motor("Motor"),
	SistemaAlimentacao("Sistema de Alimentação"),
	TurboAlimentador("Turbo Alimentador");
	
    private String name;

    private TipoManutencao(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
