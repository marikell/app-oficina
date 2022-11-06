package br.edu.infnet.appoficina.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appoficina.model.domain.Higienizacao;
import br.edu.infnet.appoficina.repository.HigienizacaoRepository;
@Service
public class HigienizacaoService {

	@Autowired
	private HigienizacaoRepository higienizacaoRepository;

	public void incluir(Higienizacao higienizacao) {
		higienizacaoRepository.save(higienizacao);		
	}

	public void excluir(Integer id) {
		higienizacaoRepository.deleteById(id);
	}

	public Collection<Higienizacao> obterLista(){
		return (Collection<Higienizacao>) higienizacaoRepository.findAll();
	}		
}
