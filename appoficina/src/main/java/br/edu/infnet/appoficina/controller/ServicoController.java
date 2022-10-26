package br.edu.infnet.appoficina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServicoController {

	private final String route = "/servico/lista";
	
	@GetMapping(value = route)
	public String telaLista() {
		return route;
	}
}
