package br.edu.infnet.appoficina.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

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

	@Override
	public String toString() {
		return id + ";" + nome + ";" + valor + ";" + codigo;
	}
}
