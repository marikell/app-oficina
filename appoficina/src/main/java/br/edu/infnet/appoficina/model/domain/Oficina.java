package br.edu.infnet.appoficina.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oficina")
public class Oficina {
	private String nome;
	private String endereco;
	private String complemento;
	private String cidade;
	private String estado;
	private String bairro;
	@OneToOne(cascade = CascadeType.DETACH) 
	@JoinColumn(name = "idGerente")
	private Gerente gerente;
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Servico> servicos;
	
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
	
	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public Gerente getGerente() {
		return gerente;
	}

	@Override
	public String toString() {
		return nome + ";" + endereco + ";" + complemento + ";" + cidade + ";" + estado + ";" + gerente + ";" +servicos.size();
	}
}
