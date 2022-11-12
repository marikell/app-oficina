package br.edu.infnet.appoficina.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appoficina.model.domain.Gerente;

@Repository
public interface GerenteRepository extends CrudRepository<Gerente, Integer> {
	@Query("from Gerente s where s.usuario.id = :userid")
	List<Gerente> obterLista(Integer userid);
}