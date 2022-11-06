package br.edu.infnet.appoficina.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appoficina.model.domain.Gerente;
import br.edu.infnet.appoficina.repository.GerenteRepository;

@Service
public class GerenteService {

	@Autowired
	private GerenteRepository gerenteRepository;

	public void incluir(Gerente bebida) {
		gerenteRepository.save(bebida);		
	}

	public void excluir(Integer id) {
		gerenteRepository.deleteById(id);
	}

	public Collection<Gerente> obterLista(){
		return (Collection<Gerente>) gerenteRepository.findAll();
	}		
}
