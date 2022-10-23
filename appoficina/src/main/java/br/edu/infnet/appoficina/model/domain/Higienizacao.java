package br.edu.infnet.appoficina.model.domain;

public class Higienizacao extends Servico {
	private TipoHigienizacao tipoHigienizacao;

	public TipoHigienizacao getTipoHigienizacao() {
		return tipoHigienizacao;
	}

	public void setTipoHigienizacao(TipoHigienizacao tipoHigienizacao) {
		this.tipoHigienizacao = tipoHigienizacao;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + tipoHigienizacao.toString();
	}
}
