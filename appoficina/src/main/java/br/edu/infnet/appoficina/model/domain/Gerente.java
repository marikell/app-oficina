package br.edu.infnet.appoficina.model.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Gerente extends Entity {	
	private String nome;
	private String cpf;
	private String email;
	private Calendar dataContratacao;
	
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
