package br.edu.infnet.appoficina.model.domain;

public class Oficina {
	public String nome;
	public String endereco;
	public String complemento;
	public String cidade;
	public String estado;

	@Override
	public String toString() {
		return this.nome + ";" + this.endereco + ";" + this.complemento + ";" + this.cidade + ";" + this.estado;
	}
}
