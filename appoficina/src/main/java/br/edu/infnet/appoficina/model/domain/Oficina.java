package br.edu.infnet.appoficina.model.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "oficina")
public class Oficina {
	private String nome;
	private String endereco;
	private String complemento;
	private String cidade;
	private String estado;
	private String bairro;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "idGerente")
	private Gerente gerente;

	public Oficina() {

	}

	public Oficina(Gerente gerente) {
		this.gerente = gerente;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Gerente getGerente() {
		return gerente;
	}

	@Override
	public String toString() {
		return nome + ";" + endereco + ";" + complemento + ";" + cidade + ";" + estado + ";" + gerente + ";";
	}
}
