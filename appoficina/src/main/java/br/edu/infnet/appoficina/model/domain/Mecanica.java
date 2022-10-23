package br.edu.infnet.appoficina.model.domain;

public class Mecanica extends Servico {
	private TipoManutencao tipoManutencao;

	public TipoManutencao getTipoManutencao() {
		return tipoManutencao;
	}

	public void setTipoManutencao(TipoManutencao tipoManutencao) {
		this.tipoManutencao = tipoManutencao;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + tipoManutencao.toString();
	}
}
