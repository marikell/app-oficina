package br.edu.infnet.appoficina.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appoficina.model.domain.Gerente;
import br.edu.infnet.appoficina.model.domain.Usuario;
import br.edu.infnet.appoficina.repository.GerenteRepository;

@Service
public class GerenteService {

	@Autowired
	private GerenteRepository gerenteRepository;

	public void incluir(Gerente gerente) {
		gerenteRepository.save(gerente);
	}

	public void excluir(Integer id) {
		gerenteRepository.deleteById(id);
	}

	public Collection<Gerente> obterLista() {
		return (Collection<Gerente>) gerenteRepository.findAll();
	}

	public Collection<Gerente> obterLista(Usuario usuario) {
		return (Collection<Gerente>) gerenteRepository.obterLista(usuario.getId());
	}
}
