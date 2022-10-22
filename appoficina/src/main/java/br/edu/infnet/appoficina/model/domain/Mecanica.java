package br.edu.infnet.appoficina.model.domain;

public class Mecanica extends Servico {
	public TipoManutencao tipoManutencao;

	@Override
	public String toString() {
		return this.nome + ";" + this.valor + ";" + this.tipoManutencao.toString();
	}
}
