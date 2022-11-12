package br.edu.infnet.appoficina.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "higienizacao")
public class Higienizacao extends Servico {
	
	public Higienizacao() {
		super(CodigoServico.Higienizacao, "Higienização");
	}

	private TipoHigienizacao tipoHigienizacao;
	private boolean necessarioArmazenamentoItensVeiculo;
	private TipoLimpeza tipoLimpeza;
	

	public TipoHigienizacao getTipoHigienizacao() {
		return tipoHigienizacao;
	}

	public void setTipoHigienizacao(TipoHigienizacao tipoHigienizacao) {
		this.tipoHigienizacao = tipoHigienizacao;
	}

	public boolean isNecessarioArmazenamentoItensVeiculo() {
		return necessarioArmazenamentoItensVeiculo;
	}

	public void setNecessarioArmazenamentoItensVeiculo(boolean necessarioArmazenamentoItensVeiculo) {
		this.necessarioArmazenamentoItensVeiculo = necessarioArmazenamentoItensVeiculo;
	}

	public TipoLimpeza getTipoLimpeza() {
		return tipoLimpeza;
	}

	public void setTipoLimpeza(TipoLimpeza tipoLimpeza) {
		this.tipoLimpeza = tipoLimpeza;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + tipoHigienizacao.toString() + ";" + tipoLimpeza.toString() + ";" + necessarioArmazenamentoItensVeiculo;
	}
}
