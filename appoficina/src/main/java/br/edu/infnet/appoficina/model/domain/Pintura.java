package br.edu.infnet.appoficina.model.domain;

import java.awt.Color;

public class Pintura extends Servico {
	private TipoPintura tipoPintura;
	private TipoMassaAplicada tipoMassaAplicada;
	private Color color;
	
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

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + tipoPintura.toString() + ";"
				+ tipoMassaAplicada.toString() +";" +color;
	}
}
