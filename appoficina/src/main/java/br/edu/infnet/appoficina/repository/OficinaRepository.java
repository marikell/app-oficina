package br.edu.infnet.appoficina.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appoficina.model.domain.Oficina;

@Repository
public interface OficinaRepository extends CrudRepository<Oficina, Integer> {

}