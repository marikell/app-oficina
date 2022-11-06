package br.edu.infnet.appoficina.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appoficina.model.domain.Mecanica;

@Repository
public interface MecanicaRepository extends CrudRepository<Mecanica, Integer> {

}