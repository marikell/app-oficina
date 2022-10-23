package br.edu.infnet.appoficina.model.domain;

public class Pintura extends Servico {
	private TipoPintura tipoPintura;
	private TipoMassaAplicada tipoMassaAplicada;
	
	public TipoPintura getTipoPintura() {
		return tipoPintura;
	}

	public void setTipoPintura(TipoPintura tipoPintura) {
		this.tipoPintura = tipoPintura;
	}

	public TipoMassaAplicada getTipoMassaAplicada() {
		return tipoMassaAplicada;
	}

	public void setTipoMassaAplicada(TipoMassaAplicada tipoMassaAplicada) {
		this.tipoMassaAplicada = tipoMassaAplicada;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + this.tipoPintura.toString() + ";"
				+ this.tipoMassaAplicada.toString();
	}
}
