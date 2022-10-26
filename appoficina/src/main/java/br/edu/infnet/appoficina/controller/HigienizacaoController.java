package br.edu.infnet.appoficina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HigienizacaoController {

	private final String route = "/higienizacao/lista";
	
	@GetMapping(value = route)
	public String telaLista() {
		return route;
	}
}
