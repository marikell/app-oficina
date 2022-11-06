package br.edu.infnet.appoficina.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appoficina.model.domain.Mecanica;
import br.edu.infnet.appoficina.repository.MecanicaRepository;

@Service
public class MecanicaService {

	@Autowired
	private MecanicaRepository mecanicaRepository;

	public void incluir(Mecanica mecanica) {
		mecanicaRepository.save(mecanica);		
	}

	public void excluir(Integer id) {
		mecanicaRepository.deleteById(id);
	}

	public Collection<Mecanica> obterLista(){
		return (Collection<Mecanica>) mecanicaRepository.findAll();
	}		
}
