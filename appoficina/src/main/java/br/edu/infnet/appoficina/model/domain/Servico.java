package br.edu.infnet.appoficina.model.domain;

public abstract class Servico {
	private String codigo;
	private String nome;
	private double valor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return this.nome + ";" + this.valor + ";" + this.codigo;
	}
}
