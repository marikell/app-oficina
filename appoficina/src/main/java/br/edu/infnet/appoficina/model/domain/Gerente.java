package br.edu.infnet.appoficina.model.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Gerente {	
	public String nome;
	public String cpf;
	public String email;
	public Calendar dataContratacao;
	
	@Override
	public String toString() {
		return nome + ";" + cpf + ";" + email + ";" + this.ObterDataContratacaoFormatado();
	}
	
	private String ObterDataContratacaoFormatado() {
		
		if (this.dataContratacao == null)
			return "";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		return sdf.format(this.dataContratacao.getTime());
	}
}
