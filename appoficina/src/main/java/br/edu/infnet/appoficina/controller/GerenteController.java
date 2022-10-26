package br.edu.infnet.appoficina.controller;

import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appoficina.model.domain.Gerente;

@Controller
public class GerenteController {

	private final String route = "/gerente/lista";
	
	
	@GetMapping(value = route)
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterGerentes());
		
		return route;
	}
	
	private List<Gerente> obterGerentes() {
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Antônio Silva");
		gerente1.setCpf("46825186925");
		gerente1.setEmail("antonio.silva@oficina.com.br");
		gerente1.setDataContratacao(getCalendar(2020, Month.APRIL, 12));

		Gerente gerente2 = new Gerente();
		gerente2.setNome("Maria Flor Souza");
		gerente2.setCpf("47825286125");
		gerente2.setEmail("mariaflor.souza@oficina.com.br");
		gerente2.setDataContratacao(getCalendar(2022, Month.APRIL, 10));

		Gerente gerente3 = new Gerente();
		gerente3.setNome("Lua Castro");
		gerente3.setCpf("46821232311");
		gerente3.setEmail("lua.castro@oficina.com.br");
		gerente3.setDataContratacao(getCalendar(2019, Month.AUGUST, 1));
	
		List<Gerente> gerentes = new ArrayList<Gerente>();
		
		gerentes.add(gerente1);
		gerentes.add(gerente2);
		gerentes.add(gerente3);
		
		return gerentes;
	}

	private Calendar getCalendar(int ano, Month month, int dia) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(Calendar.YEAR, ano);
		gc.set(Calendar.MONTH, month.getValue() - 1);
		gc.set(Calendar.DAY_OF_MONTH, dia);

		return gc;
	}
}
