package br.edu.infnet.appoficina.model.domain;

public class Pintura extends Servico {
	public TipoPintura tipoPintura;
	public TipoMassaAplicada tipoMassaAplicada;
	
	@Override
	public String toString() {
		return this.nome + ";" + this.valor + ";" + this.tipoPintura.toString() + ";"
				+ this.tipoMassaAplicada.toString();
	}
}
