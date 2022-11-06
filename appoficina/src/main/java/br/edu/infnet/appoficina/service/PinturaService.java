package br.edu.infnet.appoficina.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appoficina.model.domain.Pintura;
import br.edu.infnet.appoficina.repository.PinturaRepository;

@Service
public class PinturaService {

	@Autowired
	private PinturaRepository pinturaRepository;

	public void incluir(Pintura pintura) {
		pinturaRepository.save(pintura);		
	}

	public void excluir(Integer id) {
		pinturaRepository.deleteById(id);
	}

	public Collection<Pintura> obterLista(){
		return (Collection<Pintura>) pinturaRepository.findAll();
	}		
}
