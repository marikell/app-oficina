package br.edu.infnet.appoficina.model.domain;

public class Mecanica extends Servico {
	private TipoManutencao tipoManutencao;
	private TipoVeiculo tipoVeiculo;
	private String placa;	

	public TipoManutencao getTipoManutencao() {
		return tipoManutencao;
	}

	public void setTipoManutencao(TipoManutencao tipoManutencao) {
		this.tipoManutencao = tipoManutencao;
	}

	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + tipoManutencao.toString() + ";" + tipoVeiculo.toString() + ";" + placa;
	}
}
