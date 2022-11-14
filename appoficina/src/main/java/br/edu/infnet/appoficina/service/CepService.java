package br.edu.infnet.appoficina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appoficina.clients.IEnderecoClient;
import br.edu.infnet.appoficina.model.domain.Endereco;

@Service
public class CepService {

	@Autowired
	private IEnderecoClient enderecoClient;
	
	public Endereco obterCep(String cep) {
		return enderecoClient.obterCep(cep);
	}
}
