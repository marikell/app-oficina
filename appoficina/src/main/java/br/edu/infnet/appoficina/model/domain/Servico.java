package br.edu.infnet.appoficina.model.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "servico")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Servico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String codigo;
	private String nome;
	private double valor;
	
	@ManyToOne(cascade=CascadeType.DETACH)
	@JoinColumn(name = "idOficina")
	private Oficina oficina;

	public Servico(CodigoServico codigo, String nome) {
		this.codigo = codigo.getName();
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

	@Override
	public String toString() {
		return id + ";" + nome + ";" + valor + ";" + codigo;
	}
}
