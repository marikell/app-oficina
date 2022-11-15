package br.edu.infnet.appoficina.model.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "oficina")
public class Oficina {
	private String nome;
	
	@ManyToOne(cascade=CascadeType.DETACH)
	@JoinColumn(name = "idGerente")
	private Gerente gerente;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idEndereco")
	private Endereco endereco;


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

	public Gerente getGerente() {
		return gerente;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return nome + ";" + endereco + ";" + gerente + ";";
	}
}
