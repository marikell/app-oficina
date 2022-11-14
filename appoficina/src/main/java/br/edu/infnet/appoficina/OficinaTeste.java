package br.edu.infnet.appoficina;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.model.domain.Gerente;
import br.edu.infnet.appoficina.model.domain.Oficina;
import br.edu.infnet.appoficina.service.GerenteService;
import br.edu.infnet.appoficina.service.OficinaService;

@Order(2)
@Component
public class OficinaTeste implements ApplicationRunner {

	@Autowired
	private OficinaService oficinaService;

	@Autowired
	private GerenteService gerenteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {

//		Gerente gerente1 = new Gerente();
//
//		gerente1.setCpf("46825182990");
//		gerente1.setDataContratacao(Calendar.getInstance());
//		gerente1.setEmail("marisilva@gmail.com");
//		gerente1.setNome("Maria");
//
//		gerenteService.incluir(gerente1);
//		
//		Oficina oficina1 = new Oficina(gerente1);
//		oficina1.setNome("Oficina do João");
//
//		Oficina oficina2 = new Oficina(gerente1);
//		oficina2.setNome("Oficina do Marco");
//
//		Oficina oficina3 = new Oficina(gerente1);
//		oficina3.setNome("Oficina do Paulo");
//
//		oficinaService.incluir(oficina1);
//		oficinaService.incluir(oficina2);
//		oficinaService.incluir(oficina3);
	}
}
