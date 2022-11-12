package br.edu.infnet.appoficina.model.domain;

import java.awt.Color;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pintura")
public class Pintura extends Servico {
	private TipoPintura tipoPintura;
	private TipoMassaAplicada tipoMassaAplicada;
	private Color cor;
	
	public Pintura() {
		super(CodigoServico.Pintura, "Pintura");
	}

	
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

	public Color getCor() {
		return cor;
	}

	public void setCor(Color color) {
		this.cor = color;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + tipoPintura.toString() + ";"
				+ tipoMassaAplicada.toString() +";" +cor;
	}
}
