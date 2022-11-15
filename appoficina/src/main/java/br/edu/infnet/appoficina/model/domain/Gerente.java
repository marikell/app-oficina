package br.edu.infnet.appoficina.model.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "gerente")
public class Gerente  {	
	private String nome;
	private String cpf;
	private String email;
	private Calendar dataContratacao;
	@ManyToOne(cascade=CascadeType.DETACH)
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Calendar dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public String toString() {
		return super.toString() + ";" + nome + ";" + cpf + ";" + email + ";" + ObterDataContratacaoFormatado();
	}
	
	public String ObterDataContratacaoFormatado() {		
		if (this.dataContratacao == null)
			return "";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		return sdf.format(this.dataContratacao.getTime());
	}
}
