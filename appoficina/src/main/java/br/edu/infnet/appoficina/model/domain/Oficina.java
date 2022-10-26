package br.edu.infnet.appoficina.model.domain;

import java.util.List;

public class Oficina {
	private String nome;
	private String endereco;
	private String complemento;
	private String cidade;
	private String estado;
	private String bairro;
	private Gerente gerente;
	private List<Servico> servicos;
	
	public Oficina() {

	}
	
	public Oficina(Gerente gerente) {
		this.gerente = gerente;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	@Override
	public String toString() {
		return nome + ";" + endereco + ";" + complemento + ";" + cidade + ";" + estado + ";" + gerente + ";" +servicos.size();
	}
}
