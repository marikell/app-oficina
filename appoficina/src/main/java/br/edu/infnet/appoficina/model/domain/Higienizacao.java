package br.edu.infnet.appoficina.model.domain;

public class Higienizacao extends Servico {
	public TipoHigienizacao tipoHigienizacao;

	@Override
	public String toString() {
		return this.nome + ";" + this.valor + ";" + this.tipoHigienizacao.toString();
	}
}
