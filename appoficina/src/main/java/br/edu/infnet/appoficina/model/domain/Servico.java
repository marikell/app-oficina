package br.edu.infnet.appoficina.model.domain;

public class Servico {
	public String nome;
	public double valor;

	@Override
	public String toString() {
		return this.nome + ";" + this.valor;
	}
}
