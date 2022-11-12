package br.edu.infnet.appoficina.model.domain;

import java.awt.Color;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "pintura")
public class Pintura extends Servico {
	private TipoPintura tipoPintura;
	private TipoMassaAplicada tipoMassaAplicada;
	private Color cor;
	@Transient
	private String corTexto;
	

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

	public String getCorTexto() {
		return corTexto;
	}


	public void setCorTexto(String corTexto) {
		this.corTexto = corTexto;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + tipoPintura.toString() + ";"
				+ tipoMassaAplicada.toString() +";" +cor;
	}
}
