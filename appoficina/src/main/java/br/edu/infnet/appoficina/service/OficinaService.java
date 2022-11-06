package br.edu.infnet.appoficina.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appoficina.model.domain.Oficina;
import br.edu.infnet.appoficina.repository.OficinaRepository;

@Service
public class OficinaService {

	@Autowired
	private OficinaRepository oficinaRepository;

	public void incluir(Oficina oficina) {
		oficinaRepository.save(oficina);		
	}

	public void excluir(Integer id) {
		oficinaRepository.deleteById(id);
	}

	public Collection<Oficina> obterLista(){
		return (Collection<Oficina>) oficinaRepository.findAll();
	}		
}
