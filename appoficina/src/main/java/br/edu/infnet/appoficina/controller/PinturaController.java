package br.edu.infnet.appoficina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PinturaController {

	private final String route = "/pintura/lista";
	
	@GetMapping(value = route)
	public String telaLista() {
		return route;
	}
}
